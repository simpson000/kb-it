package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.mapper.BoardMapper;
import org.scoula.common.util.UploadFiles;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Log4j
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final static String BASE_DIR = "c:/upload/board";
    private final BoardMapper mapper;

    @Override
    public List<BoardDTO> getList() {
        log.info("getList..........");
        return mapper.getList().stream()
                .map(BoardDTO::of)
                .toList();
    }


    @Override
    public BoardDTO get(Long no) {
        log.info("get......" + no);

        BoardDTO board = BoardDTO.of(mapper.get(no));
        return Optional.ofNullable(board)
                .orElseThrow(NoSuchElementException::new);
    }

    private void upload(Long bno, List<MultipartFile> files) {
        for(MultipartFile part: files) {
            if(part.isEmpty()) continue;
            try {
                String uploadPath = UploadFiles.upload(BASE_DIR, part);
                BoardAttachmentVO attach = BoardAttachmentVO.of(part, bno, uploadPath);
                mapper.createAttachment(attach);
            } catch (IOException e) {
                throw new RuntimeException(e); // @Transactional에서 감지, 자동 rollback
            }
        }
    }

    // 2개 이상의 insert 문이 실행될 수 있으므로 트랜잭션 처리 필요 -> 하나만 실행해야 함
    // RuntimeException인 경우만 자동 rollback.
    @Transactional
    @Override
    public BoardDTO create(BoardDTO board) {
        log.info("create......" + board);

        BoardVO boardVO = board.toVo();
        mapper.create(boardVO);

        // 파일 업로드 처리
        List<MultipartFile> files = board.getFiles();
        if(files != null && !files.isEmpty()) { // 첨부 파일이 있는 경우
            upload(boardVO.getNo(), files); // Fk bno, 첨부파일
        }

        return get(boardVO.getNo());
    }

    @Override
    public BoardDTO update(BoardDTO board) {
        log.info("update...... " + board);
        BoardVO boardVO = board.toVo();
        log.info("update...... " + boardVO);
        mapper.update(boardVO);// 파일 업로드 처리
        List<MultipartFile> files = board.getFiles();
        if(files != null && !files.isEmpty()) {
            upload(board.getNo(), files);
        }
        return get(board.getNo());
    }


    @Override
    public BoardDTO delete(Long no) {
        log.info("delete...." + no);
        BoardDTO board = get(no);

        mapper.delete(no);
        return board;

    }

    // 첨부파일 한 개 얻기
    @Override
    public BoardAttachmentVO getAttachment(Long no) {
        return mapper.getAttachment(no);
    }

    // 첨부파일 삭제
    @Override
    public boolean deleteAttachment(Long no) {
        return mapper.deleteAttachment(no) == 1;
    }

}