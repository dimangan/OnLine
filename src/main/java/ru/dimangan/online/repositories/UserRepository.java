package ru.dimangan.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dimangan.online.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
