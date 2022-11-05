package com.example.setupserverstage1task.infrastructure.controllers;

import com.example.setupserverstage1task.infrastructure.services.OperationService;
import com.example.setupserverstage1task.payload.response.OperationResponse;
import com.example.setupserverstage1task.payload.response.request.OperationRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OperationController {
    private OperationService operationService;

    @PostMapping(path = "/operation-calculation")
    public ResponseEntity<OperationResponse> operationResult(@RequestBody OperationRequest operationRequest) {

        return new ResponseEntity<>(new OperationResponse(
                "Valleon",
                (operationService.operationImpl(operationRequest)),
                operationRequest.getOperation_type()
                ),
                HttpStatus.OK);

    }



}
