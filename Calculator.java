interface Calculation {
    double calculate(double a, double b);
}

public class Calculator {
    public static void main(String[] args) {

        Calculation a = (a, b) -> a + b;
        Calculation s = (a, b) -> a - b;
        Calculation m = (a, b) -> a * b;
        Calculation d = (a, b) -> a / b;

        System.out.println("Addition = " + a.calculate(20, 5));
        System.out.println("Subtraction = " + s.calculate(20, 5));
        System.out.println("Multiplication = " + m.calculate(20, 5));
        System.out.println("Division = " + d.calculate(20, 5));
    }
}