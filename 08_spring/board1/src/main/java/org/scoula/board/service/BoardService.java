package org.scoula.board.service;

import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    public List<BoardDTO> getList();
    public BoardDTO get(Long no);
    public void create(BoardDTO board);
    public boolean update(BoardDTO board);
    public boolean delete(Long no);

    public BoardAttachmentVO getAttachment(Long no);
    public boolean deleteAttachment(Long no);
}