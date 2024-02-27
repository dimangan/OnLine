package ru.dimangan.online.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.dimangan.online.models.User;
import ru.dimangan.online.services.UserService;


import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create-user")
    public void createUser(@RequestParam User user) {
        userService.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.all();
    }

    @GetMapping("/{userEmail}")
    public User getUser(@PathVariable String userEmail) {
        return userService.findUserByEmail(userEmail);
    }


}
