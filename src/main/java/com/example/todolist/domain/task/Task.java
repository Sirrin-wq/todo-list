package com.example.todolist.domain.task;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Task {

    private long id;
    private String title;
    private String description;
    private Status status;
    private LocalDate dueDate;
}
