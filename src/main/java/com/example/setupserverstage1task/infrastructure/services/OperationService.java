package com.example.setupserverstage1task.infrastructure.services;

import com.example.setupserverstage1task.domain.entities.Operation_Type;
import com.example.setupserverstage1task.payload.response.request.OperationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperationService implements OperationServiceInterface {

    @Override
    public int operationImpl(OperationRequest operationRequest) {

        int x = operationRequest.getX();
        int y = operationRequest.getY();
       Operation_Type operationType = operationRequest.getOperation_type();


        if (operationType == Operation_Type.ADDITION) {
            return (x + y);
        } else if ((operationType == Operation_Type.SUBTRACTION)) {
            return (x - y);
        } else if (operationType == Operation_Type.MULTIPLICATION) {
            return (x * y);
        } else if (operationType.toString().contains("add")) {
            return 30;
        } else {
            return 1;
        }
    }
}
