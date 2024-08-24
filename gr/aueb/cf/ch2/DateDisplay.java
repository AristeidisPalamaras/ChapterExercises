package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Display date in dd/mm/yy format from user input
 */
public class DateDisplay {

    public static void main(String[] args) {

        int d = 0, m = 0, y = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Εισάγετε ημέρα, μήνα και έτος:\n");
        d = input.nextInt();
        m = input.nextInt();
        y = input.nextInt();

        System.out.printf("%02d/%02d/%d\n", d, m, y % 100);
    }
}
