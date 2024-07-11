package com.javaogreniyorum.assignments;
import java.util.Scanner;

//klavyeden iki kenari ve derece cinsinden aradaki acisi girilen ucgenin alanini hesaplayan program ve algoritmasi

/*
a ve b iki kenar, θ bu iki kenar arasindaki derece cinsinden aci olmak uzere,
Alan = 1/2 x a x b sin(θ) ---> burada 'θ' radyan cinsinden olacak

1 - Başla
2 - input (iki kenar uzunlugu ve aralarindaki derece cinsinden aci)
3 - Derece cinsinden girilen aciyi radyana cevir
4 - Alan hesapla
5 - print(alan)
6 - Bitir
*/

public class TwoSidesOneAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the length of side 'a': ");
        double a = scanner.nextDouble();

        System.out.println("Please, enter the length of the side 'b': ");
        double b = scanner.nextDouble();

        System.out.println("Please, enter the angle between the sides 'a' & 'b' (degrees): ");
        double degrees = scanner.nextDouble();

        //convert the angle from degrees to radians
        double radians = degrees * Math.PI / 180;
        //or ---> double radians = Math.toRadians(degrees);

        //calculate the area
        double area = 0.5 * a * b * Math.sin(radians);

        System.out.println("Area: " + area);

        scanner.close();
    }
}
