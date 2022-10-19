package com.mongodb.ui;

import com.mongodb.domain.BoardRepository;
import com.mongodb.domain.Board;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    private BoardRepository repository;

    public BoardController(BoardRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/board")
    public Board save(@RequestBody BoardDto dto) {
        Board boardEntity = repository.save(new Board(dto.getTitle(), dto.getContent(), dto.getAddresses()));
        return boardEntity;
    }

    @PutMapping("board/{id}")
    public Board update(@RequestBody BoardDto dto, @PathVariable String id) {
        Board board = new Board(id ,dto.getTitle(), dto.getContent(), dto.getAddresses());
        return repository.save(board);
    }

    @DeleteMapping("board/{id}")
    public String deleteById(@PathVariable String id) {
        repository.deleteById(id);
        return "삭제 성공";
    }

    @GetMapping("/board/{id}")
    public Board findById(@PathVariable String id) {
        return repository.findById(id).get();
    }

    @GetMapping("/board")
    public List<Board> findAll() {
        return repository.findAll();
    }
}