package com.javaogreniyorum.assignments;
import java.util.Scanner;
import java.util.Arrays;

//tum elemanlari 0 (sıfır) olan n elemanlı bir a dizisi olusturan program

public class ArrayOfZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array, please: ");
        int n = scanner.nextInt();
        int A[] = new int[n]; //created an array named 'A' and set the length as 'n'

        //set all elements as zero
        //Arrays.fill : fill(int[] a, int val);
        Arrays.fill(A, 0);

        System.out.println(Arrays.toString(A));

        //or
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + (i+1) + "] = " + (A[i]));
        }
        scanner.close();
    }
}