package com.example.todolist.web.dto.task;

import com.example.todolist.domain.task.Status;
import com.example.todolist.web.dto.validation.OnCreate;
import com.example.todolist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class TaskDto {
    @NotNull(message = "Id must not be null", groups = OnUpdate.class)
    private long id;

    @NotNull(message = "Title must not be null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Title length must not be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String title;

    @Length(max = 255, message = "Description length must not be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String description;


    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDate dueDate;
}
