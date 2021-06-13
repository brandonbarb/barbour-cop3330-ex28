/*
 *  UCF COP3330 Summer 2021 Assignment 28 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int j = 0; j <= i - 1; j++) {
            System.out.printf("Enter a number: ");
            int n = input.nextInt();
            sum = sum + n;
        }
        System.out.printf("The total is %d.", sum);
    }
}
