package com.example.setupserverstage1task.payload.response.request;

import com.example.setupserverstage1task.domain.entities.Operation_Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OperationRequest {

    private Operation_Type operation_type;
    private int x;
    private int y;


    public OperationRequest(Operation_Type operation_type, int x, int y) {
        this.operation_type = operation_type;
        this.x = x;
        this.y = y;
    }


}
