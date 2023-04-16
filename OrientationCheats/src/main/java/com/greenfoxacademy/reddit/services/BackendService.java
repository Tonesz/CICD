package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.ArrayObject;
import com.greenfoxacademy.reddit.models.dtos.ArrayResultDto;
import com.greenfoxacademy.reddit.models.dtos.DoublingDto;
import com.greenfoxacademy.reddit.models.dtos.IntResultDto;
import com.greenfoxacademy.reddit.models.ObjectForOperations;
import org.springframework.stereotype.Service;

@Service
public class BackendService {


    public DoublingDto makeTheDouble(Integer number){

        return new DoublingDto(number, number * 2);
    }


    public IntResultDto factorUntil(ObjectForOperations objectForOperation) {
        int number = objectForOperation.getUntil();
        int fact = 1;
        int i;
        IntResultDto intResultPrinterDTO = new IntResultDto(0);
        for (i = 1; i <= number; i++) {
            fact = fact * i;
            intResultPrinterDTO.setResult(fact);
        }
        return intResultPrinterDTO;
    }


    public IntResultDto sumUntil(ObjectForOperations objectForOperation) {
        int number = objectForOperation.getUntil();
        return new IntResultDto(number * (number + 1) / 2);
    }
    public IntResultDto arrayHandlerSum (ArrayObject incomingArrayObject){
        int sum = 0;
        for (int i = 0; i < incomingArrayObject.getNumbers().length; i++) {
            sum = sum+incomingArrayObject.getNumbers()[i];
        }
        return new IntResultDto(sum);
    }
    public IntResultDto arrayHandlerMultiply (ArrayObject incomingArrayObject){
        int multiply = 1;
        for (int i = 0; i < incomingArrayObject.getNumbers().length; i++) {
            multiply = multiply*incomingArrayObject.getNumbers()[i];
        }
        return new IntResultDto(multiply);
    }
    public ArrayResultDto arrayHandlerDouble (ArrayObject incomingArrayObject){
        int [] doubler = new int [incomingArrayObject.getNumbers().length];
        for (int i = 0; i < incomingArrayObject.getNumbers().length; i++) {
            doubler[i] = incomingArrayObject.getNumbers()[i]*2;
        }
        return new ArrayResultDto(doubler);
    }


}
