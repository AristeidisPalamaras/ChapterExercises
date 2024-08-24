package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Draws stars in various patters (n stars horizontally, n stars vertically,
 * n rows of n stars, n rows of 1 to n stars, n rows of n to 1 stars).
 * The pattern and number of stars are chosen by the user.
 */
public class NStarsApp {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;

        do {
            displayMenu();
            input = scanner.nextInt();
            processInput(input);
        } while ( input != 6 );
    }

    /**
     * Displays a menu to the user
     */
    public static void displayMenu() {

        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με 1 εως n αστεράκια");
        System.out.println("5. Εμφάνισε n γραμμές με n εως 1 αστεράκια");
        System.out.println("6. Έξοδος");
        System.out.println("Δώσε επιλογή:");
    }

    /**
     * Chooses an action depending on user input
     *
     * @param input     The menu choice provided by the user
     */
    public static void processInput(int input) {
        switch ( input ) {
            case 1:
                nStarsH(getN());
                break;
            case 2:
                nStarsV(getN());
                break;
            case 3:
                nStarsHV(getN());
                break;
            case 4:
                nStarsAsc(getN());
                break;
            case 5:
                nStarsDesc(getN());
                break;
            case 6:
                System.out.println("Επιλέξατε Έξοδο.");
                break;
            default:
                System.out.println("Μη έγκυρη επιλογή.");
                break;
        }
    }

    /**
     * Promts the user for the number of stars to be drawn
     *
     * @return      The number of stars provided by the user
     */
    public static int getN() {
        System.out.println("Εισάγετε έναν αριθμό:");
        return scanner.nextInt();
    }

    /**
     * Draws n stars horizontaly
     *
     * @param n     The number n of stars
     */
    public static void nStarsH(int n) {
        for ( int i = 0; i < n; i++ ) {
            System.out.print('*');
        }
        System.out.println();
    }

    /**
     * Draws n stars vertically
     *
     * @param n     The number n of stars
     */
    public static void nStarsV(int n) {
        for ( int i = 0; i < n; i++ ) {
            System.out.println('*');
        }
    }

    /**
     * Draws n rows of n stars
     *
     * @param n     The number n of rows and stars
     */
    public static void nStarsHV(int n) {
        for ( int i = 0; i < n; i++ ) {
            nStarsH(n);
        }
    }

    /**
     * Draws n rows of 1 to n stars
     *
     * @param n     The number n of rows and stars
     */
    public static void nStarsAsc(int n) {
        for ( int i = 1; i <= n; i++ ) {
            nStarsH(i);
        }
    }

    /**
     * Draws n rows of n to 1 stars
     *
     * @param n     The number n of rows and stars
     */
    public static void nStarsDesc(int n) {
        for ( int i = n; i > 0 ; i-- ) {
            nStarsH(i);
        }
    }
}
