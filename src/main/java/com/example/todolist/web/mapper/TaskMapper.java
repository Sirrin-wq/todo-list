package com.example.todolist.web.mapper;

import com.example.todolist.domain.task.Task;
import com.example.todolist.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    Task toEntity(TaskDto dto);

    List<TaskDto> toDto(List<Task> tasks);
}
