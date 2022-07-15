package dev.cretara.k8test.repository;

import dev.cretara.k8test.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFilmRepository extends JpaRepository<Film, Integer> {
}
