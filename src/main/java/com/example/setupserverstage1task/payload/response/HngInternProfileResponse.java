package com.example.setupserverstage1task.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HngInternProfileResponse {

    private String slackUsername;
    private boolean backend ;
    private int age;
    private String bio;
}
