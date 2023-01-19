package io.desofme.springjenkinsdeploytestproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/spring")
@Slf4j
public class SpringController {

    @GetMapping
    public ResponseEntity<String> get() {
        log.info("Spring controller was called at: {}", LocalDate.now());
        return ResponseEntity.ok(HttpHeaders.AUTHORIZATION);
    }

}