package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    public void sum(double x, double y) {
        System.out.println(x + y);
    }

    public void divide(int x, int y) {
        try {
            System.out.println(x/y);

        }catch(ArithmeticException exc1) {
            System.out.println(exc1);
        }


    }

    public void divide(double x, double y) {
        System.out.println(x/y);

    }
}