package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Leap year calculator
 */
public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.printf("Enter a year:\n");
        input = scanner.nextInt();

        if ( ((input % 4 == 0) && !(input % 100 == 0)) || (input % 400 == 0)) {
        System.out.printf("%d is a leap year\n", input);
        } else {
        System.out.printf("%d is not a leap year\n", input);
        }


    }
}
