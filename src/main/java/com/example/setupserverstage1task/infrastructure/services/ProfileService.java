package com.example.setupserverstage1task.infrastructure.services;

import com.example.setupserverstage1task.payload.response.HngInternProfileResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ProfileService {
    public HngInternProfileResponse hngInternProfileResponse;

    public HngInternProfileResponse getHngInternProfile(){
        return hngInternProfileResponse;
    }
}
