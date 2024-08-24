package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        int x = 0, y = 0, r = 1;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter x^y: \n");

        for ( x = input.nextInt(), y = input.nextInt(); y >= 1; --y, r *= x )
            ;

        System.out.printf("x^y = %d\n", r);
    }
}
