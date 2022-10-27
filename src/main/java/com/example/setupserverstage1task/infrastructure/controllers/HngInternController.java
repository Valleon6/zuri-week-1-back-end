package com.example.setupserverstage1task.infrastructure.controllers;

import com.example.setupserverstage1task.infrastructure.services.ProfileService;
import com.example.setupserverstage1task.payload.response.HngInternProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/")
public class HngInternController {

    @Autowired
    private ProfileService profileService;

    @GetMapping(path = "/internProfile")
    public ResponseEntity <HngInternProfileResponse> getHngInternProfile() {

        return new ResponseEntity<>(new HngInternProfileResponse(
                "Valleon",
                true,
                26,
                "I'm a Java software Engineer, an Author, and an Actor."),
                HttpStatus.OK);
    }
}
