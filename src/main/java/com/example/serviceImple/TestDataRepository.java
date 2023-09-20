package com.example.serviceImple;

import com.example.model.TestData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TestDataRepository extends JpaRepository<TestData, Long> {
}
