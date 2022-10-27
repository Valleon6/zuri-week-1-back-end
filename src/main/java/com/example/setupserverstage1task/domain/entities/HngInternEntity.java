package com.example.setupserverstage1task.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class HngInternEntity {

    private String SlackUsername;
    private boolean backend;
    private int age;
    private String bio;

}
