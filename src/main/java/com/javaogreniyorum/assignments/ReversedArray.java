package com.javaogreniyorum.assignments;
import java.util.Scanner;

//klavyeden girilen n elemanli a dizisinin elemanlarini, baska bir dizi kullanmadan tersten yerlestiren program

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temporary;

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = scanner.nextInt();
        }

        //reverse the array
        for (int i = 0; i < n / 2; i++) { //if we didn't divide 'n' by 2, each element would switch their places for twice
            temporary = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temporary;
        }

        //display the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + (i+1) + "] = " + a[i]);
        }

        scanner.close();
    }
}
