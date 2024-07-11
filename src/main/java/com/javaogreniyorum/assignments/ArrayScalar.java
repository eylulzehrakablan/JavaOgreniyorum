package com.javaogreniyorum.assignments;
import java.util.Scanner;

//klavyeden girilen n elemanli a ve b dizilerinin 'skaler carpim'ini hesaplayan program

public class ArrayScalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array, please: ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter the elements of the array 'a': ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the array 'b': ");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + (i+1) + "] = ");
            b[i] = scanner.nextInt();
        }

        System.out.println("Scalar product of the arrays a & b: " + calculateScalar(a, b, n));

        scanner.close();
    }

    //scalar product = a.b = a1 . b1 + a2 . b2 + ... + an . bn
    //scalar product = skaler carpim
    public static int calculateScalar(int a[], int b[], int n) {
        int scalarProduct = 0;
        for (int i = 0; i < n; i++) {
            scalarProduct += a[i] * b[i];
        }
        return scalarProduct;
    }
}