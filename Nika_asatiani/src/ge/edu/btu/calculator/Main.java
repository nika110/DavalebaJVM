package ge.edu.btu.calculator;
import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        calculator.divide(10, 0);
        calculator.divide(4.2, 8);
        calculator.divide(10.4, 3);
        calculator.sum(20, 10);
        calculator.sum(45, 33);

    }
}