package com.example.setupserverstage1task.infrastructure.services;


import com.example.setupserverstage1task.payload.response.request.OperationRequest;

public interface OperationServiceInterface {

    int operationImpl(OperationRequest operationRequest);

}
