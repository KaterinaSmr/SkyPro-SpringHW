package pro.sky.skyprospringhw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl calculatorService;

    @Autowired
    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String plus(int num1, int num2){
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(int num1, int num2){
        return calculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(int num1, int num2){
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(int num1, int num2){
        if (num2 == 0) return "На 0 делить нельзя";
        return calculatorService.divide(num1, num2);
    }
}
