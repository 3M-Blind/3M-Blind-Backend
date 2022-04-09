package com.blind.blind_backend.controller.user;

import com.blind.blind_backend.domain.DTO.user.UserRegDTO;
import com.blind.blind_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public String register(@Validated @ModelAttribute UserRegDTO userRegDTO, BindingResult bindingResult){
        // 검증 처리
        if (bindingResult.hasErrors()){
            // 필드 에러시
            // TODO 어떻게 처리?
        }

        if (!userRegDTO.getPass().equals(userRegDTO.getPassConfirm())){
            // 글로벌 에러
            // TODO 어떻게 처리?
            bindingResult.reject("비밀번호가 일치하지 않습니다.");
        }
        // 검증 처리

        userService.regUser(userRegDTO);
        return "redirect:/";
    }

}
