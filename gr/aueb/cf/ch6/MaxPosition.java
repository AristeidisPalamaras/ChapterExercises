package gr.aueb.cf.ch6;

/**
 * Finds the position of the maximum element in an integer array.
 */
public class MaxPosition {
    public static void main(String[] args) {

        int[] arr = new int[] {1,40,-8,0,126,7,42};
        int pos = 0;

        pos = getMaxPosition(arr, 0, arr.length);

        System.out.printf("The maximum element of the array is in position %d\n", pos + 1);
    }

    /**
     * Method that returns the position of the maximum element in a range of positions in an integer array.
     *
     * @param arr   The integer array
     * @param low   The starting position of the search
     * @param high  The ending position of the search
     * @return      The position of the maximum element
     */
    public static int getMaxPosition(int[] arr, int low, int high){

        int max = Integer.MIN_VALUE;
        int pos = 0;

        for (int i = low; i < high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos = i;
            }
        }

        return pos;
    }
}
