package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {

        int choice = 0;

        do {
            System.out.println("Enter a number from 1-4. Enter 5 to quit.");
            try {
                choice = getChoice();
                printChoice(choice);
            } catch (InputMismatchException e) {
                System.out.println("input not a number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Input out of range.");
            }
        } while (choice != 5);

    }

    public static int getChoice() throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            input.nextLine();
            throw new InputMismatchException();
        }

        return input.nextInt();
    }

    public static void printChoice(int choice) throws IllegalArgumentException {

        if (choice < 1 | choice > 5) {
            throw new IllegalArgumentException();
        }

        switch (choice) {
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            case 3:
                System.out.println("You chose 3");
                break;
            case 4:
                System.out.println("You chose 4");
                break;
            case 5:
                System.out.println("Exiting");
                break;
        }
    }
}
