package gr.aueb.cf.ch6;

/**
 * Finds the second least element in an integer array.
 * The problem is solved by sorting the array in ascending order and returning the second element in the sorted array.
 */
public class SecondLeast {
    public static void main(String[] args) {

        int[] arr = new int[] {1,40,-8,0,126,7,42};

        arrSort(arr);

        System.out.printf("The second least item in the array is %d\n", arr[1]);
    }

    /**
     * Uses selection sort to sort an input array in ascending order.
     * @param arr   The input array
     */
    public static void arrSort(int[] arr) {

        int min = Integer.MAX_VALUE;
        int minPos = -1;
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPos = j;
                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[minPos] = tmp;
        }
    }
}
