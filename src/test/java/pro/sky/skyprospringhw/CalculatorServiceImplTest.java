package pro.sky.skyprospringhw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private CalculatorServiceImpl calculatorService;

    @BeforeEach
    public void setUp(){
        num1 = 10;
        num2 = 20;
        num3 = -8;
        num4 = 2;
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    void plusTestPositiveNumbers() {
        int result = 30;
        assertEquals(calculatorService.plus(num1, num2), result);
    }
    @Test
    void plusTestNegativeAndPositive() {
        int result = -6;
        assertEquals(calculatorService.plus(num3, num4), result);
    }

    @Test
    void minusTestPositiveNumbers() {
        int result = -10;
        assertEquals(calculatorService.minus(num1,num2), result);
    }
    @Test
    void minusTestNegativeAndPositive(){
        int result = -10;
        assertEquals(calculatorService.minus(num3,num4),result);
    }

    @Test
    void multiplyTestPositiveNumbers() {
        int result = 200;
        assertEquals(calculatorService.multiply(num1, num2), result);
    }
    @Test
    void multiplyTestNegativeAndPositive(){
        int result = -16;
        assertEquals(calculatorService.multiply(num3, num4), result);
    }

    @Test
    void divideTestPositiveNumbers() {
        int result = 0;
        assertEquals(calculatorService.divide(num1,num2),result);
    }
    @Test
    void divideTestNegativeAndPositive(){
        int result = -4;
        assertEquals(calculatorService.divide(num3, num4), result);
    }
    @Test
    void divideTestShouldThrowException(){
        assertThrows(DividingByZeroException.class,() -> calculatorService.divide(num1,0));
    }
}