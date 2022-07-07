package dev.cretara.k8test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("api/base")
@Slf4j
public class BaseController {

    @GetMapping("/")
    public String hello() {
        log.info("hello");
        return "FUNZIONA!";
    }

}
