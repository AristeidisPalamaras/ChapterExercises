package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Read 6 integers from 0-49 from standard input and apply several predicates.
 */
public class PredicatesApp {
    public static void main(String[] args) {

        int[] inputArray = new int[] {1,40,0,7,8,42};

//        int[] inputArray = new int[6];
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter 6 integers from 0-49");
//        for (int i = 0; i < 6; i++) {
//            inputArray[i] = in.nextInt();
//        }

        System.out.printf("The input array has %s than 3 even integers\n",
                (checkEven(inputArray)) ? "less" : "more");
        System.out.printf("The input array has %s than 3 odd integers\n",
                (checkOdd(inputArray)) ? "less" : "more");
        System.out.printf("The input array has %s than 3 continuous integers\n",
                (checkCont(inputArray)) ? "less" : "more");
        System.out.printf("The input array has %s than 3 integers with the same second digit\n",
                (checkOnes(inputArray)) ? "less" : "more");
        System.out.printf("The input array has %s than 3 integers with the same first digit\n",
                (checkTens(inputArray)) ? "less" : "more");

    }

    /**
     * Return true if the input array has less than 3 even integers.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean checkEven(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if ( (i % 2) == 0) {
                count++;
            }
        }
        return (count <= 3);
    }

    /**
     * Return true if the input array has less than 3 odd integers.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean checkOdd(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if ( (i % 2) != 0) {
                count++;
            }
        }
        return (count <= 3);
    }

    /**
     * Return true if the input array has less than 3 continuous integers.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean checkCont(int[] arr) {


        return true;
    }

    /**
     * Return true if the input array has less than 3 integers with the same
     * number in the ones position.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean checkOnes(int[] arr) {
        int[] ones = new int[10];

        for (int i : arr) {
            ones[i % 10]++;
        }

        for (int i : ones) {
            if (i > 3) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return true if the input array has less than 3 integers with the same
     * number in the tens position.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean checkTens(int[] arr) {
        int[] tens = new int[5];

        for (int i : arr) {
            tens[i / 10]++;
        }

        for (int i : tens) {
            if (i > 3) {
                return false;
            }
        }
        return true;
    }
}
