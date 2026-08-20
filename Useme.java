package useful;

import java.util.Scanner;

public class Useme {

    Scanner sc = new Scanner(System.in);

    public void area() {
        System.out.println("Area of Circle");

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double a = Math.PI * r * r;

        System.out.println("Area = " + a);
    }

    public void salary() {
        System.out.println("Calculate Salary");

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double total = basic + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Total Salary = " + total);
    }

    public void percentage() {
        System.out.println("Calculate Percentage");

        double total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total = total + sc.nextDouble();
        }

        double percentage = total / 5;

        System.out.println("Percentage = " + percentage + "%");
    }
}