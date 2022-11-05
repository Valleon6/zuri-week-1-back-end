package com.example.setupserverstage1task.payload.response;

import com.example.setupserverstage1task.domain.entities.Operation_Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationResponse {

    private String slackUsername;
    private int result;
    private Operation_Type operation_type;



}
