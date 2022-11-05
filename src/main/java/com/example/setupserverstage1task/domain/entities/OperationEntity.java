package com.example.setupserverstage1task.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationEntity {

    private Operation_Type operationType;
    private int x;
    private int y;


}
