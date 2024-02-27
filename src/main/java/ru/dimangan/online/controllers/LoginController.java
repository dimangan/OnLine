package ru.dimangan.online.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dimangan.online.models.LoginRequest;
import ru.dimangan.online.models.LoginResponse;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String login() {
        log.info("login");

        return "/login";
    }

    @PostMapping("/login/auth")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {

        log.info("login auth");
        return new LoginResponse("Bla bla bla");
    }

}
