package com.javaogreniyorum.assignments;
import java.util.Scanner;

//klavyeden girilen n elemanli a dizisini bir 'k' katsayisi ile carpip b dizisi olusturan ve yazdiran program

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter the multiplier (k): ");
        int k = scanner.nextInt();

        System.out.println("Enter the elements of the array 'a': ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = scanner.nextInt();
        }

        multiply(a, b, k, n); //multiply array a's elements

        //display the multiplied elements
        System.out.println("Array b's elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println("b[" + (i+1) + "] = " + b[i]);
        }
        scanner.close();
    }

    public static void multiply(int a[], int b[], int k, int n) {
        for (int i = 0; i < n; i++) {
            b[i] = a[i] * k;
        }
    }
}