package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Implements five array methods:
 * 1. Search for an element in an array and return its position
 * 2. Print the even elements of an array
 * 3. Doubles the elements of an array and returns a new array with them
 * 4. Checks if the array contains at least one positive integer and returns a boolean
 * 5. Checks if all the elements of the array are positive integers and returns a boolean
 */
public class ArrayMethods {
    public static void main(String[] args) {

        int[] arr = new int[] {1,40,-8,0,126,7,42};

        // Display the array
        System.out.printf("The array is: ");
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Find the position of number 42
        int x = 42;
        int pos = getElementPosition(arr, x);

        if (pos != -1) {
            System.out.printf("%d is in position %d\n", x, pos + 1);
        } else {
            System.out.printf("%d is not in the array\n", x);
        }

        // Print the even elements of the array
        printEvenElements(arr);

        // Create a copy of the array where every element is doubled
        int[] doubleArr = doubleArray(arr);
        System.out.printf("Doubling the elements of the array gives: ");
        for (int i : doubleArr) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Check if the array contains at least one positive integer
        boolean containsOnePos = onePosInt(arr);
        if (containsOnePos) {
            System.out.println("The array contains at least one positive integer");
        } else {
            System.out.println("The array does not contain any positive integers");
        }

        // Check if the array contains only positive integers
        boolean isAllPos = allPosInt(arr);
        if (isAllPos) {
            System.out.println("The array contains only positive integers");
        } else {
            System.out.println("The array does not contain only positive integers");
        }
    }

    /**
     * Returns the position of an element in an array.
     *
     * @param arr   the input array
     * @param x     the input element
     * @return      the position of the element
     */
    public static int getElementPosition(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
            }
        return -1;
    }

    /**
     * Prints the even elements of an input array.
     *
     * @param arr   the input array
     */
    public static void printEvenElements(int[] arr) {
        System.out.printf("The even items of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println();
    }

    /**
     * Creates a copy of an input array and doubles its elements.
     *
     * @param arr   the input array
     * @return      a copy of the array with doubled elements
     */
    public static int[] doubleArray (int[] arr) {
        int[] doubleArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < doubleArr.length; i++ ) {
            doubleArr[i] *= 2;
        }
        return doubleArr;
    }

    /**
     * Checks if the input array contains at least one positive integer and returns a boolean.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean onePosInt (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) return true;
        }
        return false;
    }

    /**
     *Checks if the input array contains only positive integers and returns a boolean.
     *
     * @param arr   the input array
     * @return      true/false
     */
    public static boolean allPosInt (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return false;
        }
        return true;
    }
}
