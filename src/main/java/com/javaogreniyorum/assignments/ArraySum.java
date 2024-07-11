package com.javaogreniyorum.assignments;
import java.util.Scanner;

//klavyeden girilen n elemanli a ve b dizilerini toplayarak c dizisini olusturan ve yazdiran program

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        System.out.println("Enter the elements of the array 'a': ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "] = ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the array 'b': ");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + (i + 1) + "] = ");
            b[i] = scanner.nextInt();
        }

        //add the array c's elements by summing the elements of the arrays 'a' & 'b'
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        //display
        for (int i = 0; i < n; i++) {
            System.out.println("c[" + (i + 1) + "] = " + c[i]);
        }

        scanner.close();
    }
}