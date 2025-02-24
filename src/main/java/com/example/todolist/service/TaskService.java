package com.example.todolist.service;

import com.example.todolist.domain.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long taskId);

    List<Task> getAllByUserId(Long userId);

    Task update(Task task);

    Task create(Task task, Long userId);

    void delete(Long taskId);
}
