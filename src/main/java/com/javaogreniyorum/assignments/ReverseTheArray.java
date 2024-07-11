package com.javaogreniyorum.assignments;
import java.util.Scanner;

//klavyeden girilen n elemanli a dizisinin elemanlarini, ters sirada b dizisine yerlestiren ve yazdiran program

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter the elements of the array 'a', this array is going to be reversed.");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = scanner.nextInt();
        }

        //reverse the array
        for (int i = 0; i < n; i++) {
            b[i] = a[n - 1 - i];
        }

        System.out.println("\nReversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.println("b[" + (i+1) + "] = " + b[i]);
        }

        scanner.close();
    }
}