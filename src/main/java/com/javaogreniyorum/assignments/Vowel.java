package com.javaogreniyorum.assignments;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String myString = scanner.nextLine();
        char[] name = myString.toLowerCase().toCharArray();

        System.out.println(countVowels(name));

        scanner.close();
    }

    public static int countVowels(char[] name) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;

        for (char letter : name) {
            for (char vowel : vowels) {
                if (letter == vowel) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
