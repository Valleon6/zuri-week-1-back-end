package com.example.setupserverstage1task.infrastructure.controllers;

import com.example.setupserverstage1task.payload.response.HngInternProfileResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HngInternController {
    @GetMapping("/")
    public ResponseEntity<HngInternProfileResponse> getHngInternProfile() {
        return new ResponseEntity<>(new HngInternProfileResponse(
                "Valleon",
                true,
                26,
                "I'm a Java software Engineer, an Author, and an Actor."),
                HttpStatus.OK);
    }
}