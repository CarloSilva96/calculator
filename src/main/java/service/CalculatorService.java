package service;

public class CalculatorService implements Calculator {

    @Override
    public double sum(double valueOne, double valueTwo) {
        return valueOne + valueTwo;
    }

    @Override
    public double divide(double valueOne, double valueTwo) {
        return valueOne / valueTwo;
    }

    @Override
    public double subtract(double valueOne, double valueTwo) {
        return valueOne - valueTwo;
    }

    @Override
    public double multiply(double valueOne, double valueTwo) {
        return valueOne * valueTwo;
    }

    @Override
    public double rootSquare(double value) {
        return Math.sqrt(value);
    }
}
