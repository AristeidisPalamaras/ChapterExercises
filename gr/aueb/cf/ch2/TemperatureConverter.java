package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert temperatures from Fahrenheit to Celcius
 */
public class TemperatureConverter {

    public static void main(String[] args) {

        int c = 0, f = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Εισάγετε θερμοκρασία στην κλίμακα Φάρεναϊτ:\n");
        f = input.nextInt();

        c = 5 * (f - 32) / 9;
        System.out.printf("%d βαθμοί στην κλίμακα Φάρεναϊτ είvαι %d βαθμοί στην κλίμακα Κελσίου.\n", f, c);
    }
}
