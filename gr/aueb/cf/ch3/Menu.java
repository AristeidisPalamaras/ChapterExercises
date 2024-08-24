package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Simple menu that repeatedly prompts the user for input.
 */
public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Αναζήτηση");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            System.out.println("Δώστε αριθμό επιλογής:");

            input = scanner.nextInt();

            if ( input == 1 ) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if ( input == 2 ) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if ( input == 3 ) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if  ( input == 4 ) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if ( input == 5 ) {
                System.out.println("Επιλέξατε Έξοδο");
                break;
            } else  {
                System.out.println("Λάθος επιλογη");
            }
        } while (true);
    }
}
