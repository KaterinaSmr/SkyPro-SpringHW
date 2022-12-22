package pro.sky.skyprospringhw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {
    private CalculatorServiceImpl calculatorService;
    @BeforeEach
    public void init(){
        calculatorService = new CalculatorServiceImpl();
    }
    public static Stream<Arguments> provideParamsForPlusTest(){
        return Stream.of(
                Arguments.of(10,20,30),
                Arguments.of(-1,-3,-4),
                Arguments.of(-100,0,-100)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void plus(int num1, int num2, int result){
        assertEquals(result, calculatorService.plus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMinusTest(){
        return Stream.of(
                Arguments.of(10,20,-10),
                Arguments.of(-1,-3,2),
                Arguments.of(-100,0,-100)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void minus(int num1, int num2, int result){
        assertEquals(result, calculatorService.minus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMultiplyTest(){
        return Stream.of(
                Arguments.of(10,20,200),
                Arguments.of(-1,-3,3),
                Arguments.of(-100,0,0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void multiply(int num1, int num2, int result){
        assertEquals(result, calculatorService.multiply(num1, num2));
    }
    public static Stream<Arguments> provideParamsForDivideTest(){
        return Stream.of(
                Arguments.of(20,10,2),
                Arguments.of(-3,-1,3),
                Arguments.of(0,-100,0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void divide(int num1, int num2, int result){
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}