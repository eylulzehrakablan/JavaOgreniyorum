package com.javaogreniyorum.miniprojects;
import java.util.Scanner;

enum Planet {
    MERCURY(3.7),
    VENUS(8.87),
    EARTH(9.8),
    MARS(3.7),
    JUPITER(24.79),
    SATURN(10.45),
    URANUS(8.70),
    NEPTUNE(11.1);

    private final double gravity;

    Planet(double gravity) {
        this.gravity = gravity;
    }

    public double getGravity() {
        return gravity;
    }
}

public class GravityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Planet.values().length; i++) {
            Planet planet = Planet.values()[i];
            System.out.println((i + 1) + ". " + planet.name());
        }

        System.out.println("Please, choose a planet: ");
        int secim = scanner.nextInt();

        //x(t) = 0.5 * a * t^2 + vi * t + xi

        try {
            Planet chosen = Planet.values()[secim - 1];
            double gravity = chosen.getGravity();

            System.out.println("initial velocity: ");
            double initialVelocity = scanner.nextDouble();

            System.out.println("falling time: ");
            double fallingTime = scanner.nextDouble();

            double initialPosition = 0.0;

            double finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;

            System.out.println("After " + fallingTime + " seconds on the planet " + chosen.name() + " the final position is " + finalPosition + " meters");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}