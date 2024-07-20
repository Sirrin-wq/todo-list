package com.example.todolist.service;

import com.example.todolist.domain.user.User;

public interface UserService {

    User getById(Long userId);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    User delete(Long userId);

}
