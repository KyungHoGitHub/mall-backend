package com.study.mallbackend.controller;

import com.study.mallbackend.dto.TodoDTO;
import com.study.mallbackend.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo")
    public ResponseEntity<Long> createTodo(@RequestBody TodoDTO requestDto){
        // TODO document why this method is empty
        Long data = todoService.register(requestDto);

        return  ResponseEntity.ok(data);
    }
}
