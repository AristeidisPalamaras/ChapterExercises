package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NStarsDesc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter a numer:");

        n = input.nextInt();

        for ( int i = n; i > 0 ; i-- ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
