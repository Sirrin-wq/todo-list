package com.example.todolist.repository;

import com.example.todolist.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Optional<Task> findTaskById(Long taskId);

    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long taskId, Long UserId);

    void update(Task task);

    void create(Task task);

    void delete(Long taskId);
}
