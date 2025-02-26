package com.study.mallbackend.service;

import com.study.mallbackend.domain.Todo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TodoServiceImpl implements TodoService{
    @Override
    public Long register(Todo todo) {
        return 0L;
    }
}
