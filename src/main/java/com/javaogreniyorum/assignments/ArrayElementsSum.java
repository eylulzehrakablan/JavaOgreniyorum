package com.javaogreniyorum.assignments;
import java.util.Scanner;

public class ArrayElementsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter the size of the array please: ");
        int n = scanner.nextInt();

        int A[] = new int[n]; //created an array named 'A' and set the length

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + (i + 1) + "] = ");
            A[i] = scanner.nextInt();
        }

        //sum of the elements
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        System.out.println("The sum of the elements: " + sum);

        scanner.close();
    }
}