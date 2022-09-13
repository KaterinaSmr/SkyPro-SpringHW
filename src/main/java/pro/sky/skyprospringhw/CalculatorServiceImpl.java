package pro.sky.skyprospringhw;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
