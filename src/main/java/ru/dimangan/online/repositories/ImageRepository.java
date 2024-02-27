package ru.dimangan.online.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dimangan.online.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
