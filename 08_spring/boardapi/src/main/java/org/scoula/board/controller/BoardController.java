package org.scoula.board.controller;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.scoula.common.util.UploadFiles;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

@Data
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Log4j

public class BoardController {
    final private BoardService service;

    @GetMapping("")
    public ResponseEntity<List<BoardDTO>> getList() {
        return ResponseEntity.ok(service.getList());
    }
    @GetMapping("/{no}")
    public ResponseEntity<BoardDTO> get(@PathVariable Long no) {
        return ResponseEntity.ok(service.get(no));
    }
    @PostMapping("")
    public ResponseEntity<BoardDTO> create(@RequestBody BoardDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }
    @PutMapping("/{no}")
    public ResponseEntity<BoardDTO> update(@PathVariable("no") int no, @RequestBody BoardDTO board) {
        return ResponseEntity.ok(service.update(board));
    }
    @DeleteMapping("/{no}")
    public ResponseEntity<BoardDTO> delete(@PathVariable Long no) {
        return ResponseEntity.ok(service.delete(no));
    }
    @GetMapping ("/list")
    public void list(Model model) {
        log.info("list");
        model.addAttribute("list",service.getList());
    }

}
