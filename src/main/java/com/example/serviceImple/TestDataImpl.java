package com.example.serviceImple;

import com.example.model.TestData;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestDataImpl {

    @Autowired
    private TestDataRepository testDataRepository;

    public TestDataImpl(TestDataRepository testDataRepository) {
        this.testDataRepository = testDataRepository;
    }

    public TestData saveEmployee(TestData testData){
       System.out.println(testData.toString());
       testDataRepository.save(testData);
       return testData;

    }

    public List<TestData> getAll(){
        List<TestData> testDatas= testDataRepository.findAll().stream().collect(Collectors.toList());
        return testDatas;
    }


}
