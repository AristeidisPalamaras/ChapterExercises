package gr.aueb.cf.ch6;

public class LowAndHigh {
    public static void main(String[] args) {

        int[] arr = new int[] {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] indexLowHigh = getLowAndHighIndexOf(arr, key);

        if (indexLowHigh[0] == -1) {
            System.out.printf("%d not found\n", key);
        } else {
            System.out.printf("%d appears at index positions %d-%d\n",
                    key, indexLowHigh[0], indexLowHigh[1]);
        }
    }

    /**
     * Find the lowest and highest indices of a key in a sorted array.
     *
     * @param arr   The input array.
     * @param key   The number to search for
     * @return      An array containing the lowest and highest index
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {

        int[] result = new int[2];
        int indexLow = -1;
        int indexHigh = -1;

        for (int i = 0; i < arr.length; i++) {
            if (indexLow == -1 && arr[i] == key) {
                indexLow = i;
                indexHigh = i;
            }
            if (arr[i] == key) {
                indexHigh = i;
            }
        }

        result[0] = indexLow;
        result[1] = indexHigh;

        return result;
    }
}
