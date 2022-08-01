package dev.cretara.k8test.controller;

import dev.cretara.k8test.dto.FilmDTO;
import dev.cretara.k8test.service.IFilmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/films")
@Slf4j
public class FilmController {

    @Lazy
    private final IFilmService filmService;

    private static final String API_FILMS_PATH = "/api/films";

    @GetMapping("/")
    @ResponseBody
    public List<FilmDTO> getallfilms() {
        log.info("GET " + API_FILMS_PATH);
        return filmService.getallfilms();
    }

}
