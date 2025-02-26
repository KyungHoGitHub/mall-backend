package com.study.mallbackend.service;

import com.study.mallbackend.domain.Todo;
import com.study.mallbackend.dto.TodoDTO;

public interface TodoService {
    Long register(TodoDTO todoDTO);
}
