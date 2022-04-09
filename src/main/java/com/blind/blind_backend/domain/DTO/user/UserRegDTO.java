package com.blind.blind_backend.domain.DTO.user;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class UserRegDTO {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String username;
    @NotBlank
    private String nickname;
    @NotBlank
    private String pass;
    @NotBlank
    private String passConfirm;
}
