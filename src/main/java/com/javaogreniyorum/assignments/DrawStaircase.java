package com.javaogreniyorum.assignments;

public class DrawStaircase {
    public static void main(String[] args) {
        int stepNum = 5;
        int stepWidth = 3;

        for (int i = 0; i < stepNum; i++) {
            for (int j = 0; j < (i + 1) * stepWidth; j++) {
                System.out.print("*");
            }
            //change row
            System.out.println();
        }
    }
}