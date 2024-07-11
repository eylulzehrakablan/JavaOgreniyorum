package com.javaogreniyorum.assignments;
import java.util.Scanner;

//'derece' olarak girilen aciyi, 'radyan' ve 'grad'a ceviren program

public class AngleConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the angle (degrees): ");
        double degrees = scanner.nextDouble();

        //convert
        double radians = degrees * Math.PI / 180;
        double grads = degrees * 10 / 9;

        System.out.println("\nValue to be converted in degrees: " + degrees + "\n");
        System.out.println("Radians: " + radians);
        System.out.println("Grads: " + grads);

        scanner.close();
    }
}