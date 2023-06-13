package com.example.digitsum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class DigitSumApplicationTest {
    Controller digitSumController = new Controller();

    @Test
    void DigitSumTest1(){
        int res = digitSumController.calcDigitSum(1234);
        assertEquals(res, 10);
    }
}


