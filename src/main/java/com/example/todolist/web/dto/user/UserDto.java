package com.example.todolist.web.dto.user;

import com.example.todolist.web.dto.validation.OnCreate;
import com.example.todolist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {

    @NotNull(message = "Id must not be null", groups = OnUpdate.class)
    private long id;

    @NotNull(message = "Name must not be null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name length must not be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Username must not be null", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Username length must not be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must not be null", groups = OnUpdate.class)
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "PasswordConfirmation must not be null", groups = OnCreate.class)
    private String passwordConfirmation;
}
