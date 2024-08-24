package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NStarsHV {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter a numer:");

        n = input.nextInt();

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
