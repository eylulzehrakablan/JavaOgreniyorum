package com.javaogreniyorum.assignments;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number, please: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number, please: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number, please: ");
        double num3 = scanner.nextDouble();

        double average = Averageee(num1, num2, num3);
        System.out.printf("The average of these three numbers is: %.2f", average);

        scanner.close();
    }

    public static double Averageee(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

}