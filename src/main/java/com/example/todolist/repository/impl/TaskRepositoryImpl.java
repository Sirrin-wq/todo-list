package com.example.todolist.repository.impl;

import com.example.todolist.domain.task.Task;
import com.example.todolist.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findTaskById(Long taskId) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void assignToUserById(Long taskId, Long UserId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long taskId) {

    }
}
