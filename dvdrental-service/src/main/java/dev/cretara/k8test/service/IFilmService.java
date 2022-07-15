package dev.cretara.k8test.service;

import dev.cretara.k8test.dto.FilmDTO;

import java.util.List;

public interface IFilmService {
    List<FilmDTO> getallfilms();
}
