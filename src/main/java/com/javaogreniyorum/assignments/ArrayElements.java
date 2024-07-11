package com.javaogreniyorum.assignments;
import java.util.Scanner;

//n tane verinin klavyeden girilmesi ve A dizisine yerlestirilmesi

public class ArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array, please: ");
        int n = scanner.nextInt();

        int A[] = new int[n]; //create an array and set the length of the array

        //add the elements
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + (i + 1) + "] = ");
            A[i] = scanner.nextInt();
        }

        //display the elemtens
        System.out.println("The elements of the array: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + (i + 1) + "] = " + A[i]);
        }
        scanner.close();
    }
}