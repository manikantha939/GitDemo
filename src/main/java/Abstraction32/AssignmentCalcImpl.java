package Abstraction32;

public class AssignmentCalcImpl implements AssignmentCalculator {
    @Override
    public double sum(double a, double b) {
        return a+b;
    }
    @Override
    public double sub(double a, double b) {
        return a-b;
    }
    @Override
    public double mul(double a, double b) {
        return a*b;
    }
    @Override
    public double div(double a, double b) {
        return a/b;
    }
}
