package dev.cretara.k8test.service.impl;

import dev.cretara.k8test.dto.FilmDTO;
import dev.cretara.k8test.model.Film;
import dev.cretara.k8test.repository.IFilmRepository;
import dev.cretara.k8test.service.IFilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class FilmServiceImpl implements IFilmService {

    @Lazy
    private final IFilmRepository filmRepository;

    @Override
    public List<FilmDTO> getallfilms() {
        PageRequest filmPageable = PageRequest.of(0, 100, Sort.by(Sort.Direction.ASC, "description"));
        Page<Film> filmList = filmRepository.findAll(filmPageable);
        return filmList
                .stream()
                .map(singleFilm -> FilmDTO.builder()
                                          .id(singleFilm.getId())
                                          .build())
                .collect(Collectors.toList());
    }

}
