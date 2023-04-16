package com.greenfoxacademy.reddit.controllers;


import com.greenfoxacademy.reddit.models.ArrayObject;
import com.greenfoxacademy.reddit.models.dtos.DoublingDto;
import com.greenfoxacademy.reddit.models.ObjectForOperations;
import com.greenfoxacademy.reddit.models.dtos.ErrorDto;
import com.greenfoxacademy.reddit.services.BackendService;
import com.greenfoxacademy.reddit.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class VictorController {

    BackendService backendAPIServicesImpl;
    LogService logService;

    @Autowired
    public VictorController(BackendService backendAPIServicesImpl, LogService logService) {
        this.backendAPIServicesImpl = backendAPIServicesImpl;
        this.logService = logService;
    }




    @GetMapping("/doubling")
    public ResponseEntity showDouble(@RequestParam(required = false) Integer input) {

        logService.createLog("/doubling",input.toString());




        if (input != null) {
            DoublingDto doubler = backendAPIServicesImpl.makeTheDouble(input);
            return ResponseEntity.status(200).body(doubler);
        } else {
            return ResponseEntity.status(400).body(new ErrorDto("Please provide an input!"));
        }

    }

//    if (input == null){
//        return ResponseEntity.status(400).body(new ErrorMessage("Please provide an input!"));
//    } else return ResponseEntity.status(200).body(mainService.doubling(input));

    @PostMapping("/dountil/{operation}")
    public String getOperationType(@PathVariable(name = "operation") String operation) {
        logService.createLog("/doubling",operation);
        if (operation.equals("sum")) {
            return "redirect:/dountil/sum";
        } else {
            return "redirect:/dountil/factor";
        }
    }


    @PostMapping("/dountil/sum")
    public ResponseEntity getSum(@RequestBody ObjectForOperations incomingObject) {
        logService.createLog("/dountil/sum",incomingObject.toString());
        ObjectForOperations objectForOperation = incomingObject;
        return ResponseEntity.status(200).body(backendAPIServicesImpl.sumUntil(objectForOperation));
    }

    @PostMapping("/dountil/factor")
    public ResponseEntity getFactor(@RequestBody ObjectForOperations incomingObject) {
        logService.createLog("/dountil/factor",incomingObject.toString());
        ObjectForOperations objectForOperation = incomingObject;
        return ResponseEntity.status(200).body(backendAPIServicesImpl.factorUntil(objectForOperation));
    }
    @PostMapping("/arrays")
    public ResponseEntity arrayController(@RequestBody ArrayObject incomingArrayObject) {
        logService.createLog("/arrays",incomingArrayObject.toString());
        ArrayObject objectForOperation = incomingArrayObject;
        if (objectForOperation.getWhat().equals("sum")) {
            return ResponseEntity.status(200)
                    .body(backendAPIServicesImpl.arrayHandlerSum(objectForOperation));
        } else if (objectForOperation.getWhat().equals("multiply")) {
            return ResponseEntity.status(200)
                    .body(backendAPIServicesImpl.arrayHandlerMultiply(objectForOperation));
        } else if (objectForOperation.getWhat().equals("double")) {
            return ResponseEntity.status(200)
                    .body(backendAPIServicesImpl.arrayHandlerDouble(objectForOperation));
        } else {
            return ResponseEntity.status(400)
                    .body(new ErrorDto("Please provide what to do with the numbers!"));
        }
    }





}
