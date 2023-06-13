package com.example.digitsum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping
    public int calcDigitSum(@RequestParam Integer number) {
        if (number == 0)
            return 0;

        int sum = 0;

        int tempNumber = number;

        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        return sum;
    }

}
