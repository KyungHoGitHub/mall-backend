package com.study.mallbackend.service;

import com.study.mallbackend.domain.Todo;
import com.study.mallbackend.dto.TodoDTO;
import com.study.mallbackend.repository.TodoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class TodoServiceImpl implements TodoService{

    private final ModelMapper modelMapper;

    private final TodoRepository todoRepository;


    @Override
    public Long register(TodoDTO todoDTO) {
        log.info("......");

        Todo todo = modelMapper.map(todoDTO, Todo.class);

        Todo savedTodo = todoRepository.save(todo);
        return savedTodo.getTno();

    }
}
