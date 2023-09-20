package com.example.controller;

import com.example.model.TestData;
import com.example.serviceImple.TestDataImpl;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class TestController {

    private TestDataImpl testDataImpl;

    @GetMapping("/publish")
    public ResponseEntity<String> publish(){

        return  ResponseEntity.ok("Message sent to Topic");
    }

    @GetMapping("/testData" )
    public List<TestData> getTestData(){

        //TestData testData = new TestData(1,"Sidh","my Name");
        return testDataImpl.getAll();

    }

    @PostMapping("/testData")
    public TestData postTestData(@RequestBody TestData testData){

        return testDataImpl.saveEmployee(testData);
    }
}
