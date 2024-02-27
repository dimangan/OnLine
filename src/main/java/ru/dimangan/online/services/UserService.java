package ru.dimangan.online.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.dimangan.online.enums.Role;
import ru.dimangan.online.models.User;
import ru.dimangan.online.repositories.UserRepository;


import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public boolean createUser(User user) {
        String email = user.getEmail();
        if (userRepository.findByEmail(email) != null) {
            return false;
        }
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        userRepository.save(user);
        log.info("User created: " + email);
        return true;
    }


    public List<User> all() {
        return userRepository.findAll();
    }

    public User findUserByEmail(String userEmail) {
        return userRepository.findByEmail(userEmail);
    }
}
