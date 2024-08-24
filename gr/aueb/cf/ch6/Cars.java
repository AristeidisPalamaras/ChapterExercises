package gr.aueb.cf.ch6;

public class Cars {
    public static void main(String[] args) {

        // Each row represent a car.
        // The columns represent the arrival and departure time of a car.
        int[][] carArray = new int[][] {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        // Each row represents a point in time.
        // Columns represent the time and whether a car arrived or departed.
        // Assuming one arrival and one departure for each car,
        // the dimensions of the array must be [number of cars * 2][2].
        int[][] timeArray = new int[carArray.length * 2][2];

        int i = 0;
        for (int[] car : carArray) {
            timeArray[i++] = new int[] {car[0], 1};
            timeArray[i++] = new int[] {car[1], 0};
        }

        sortArr(timeArray);

        System.out.printf("The max number of cars parked at the same time is %d\n",
                maxConsecArrivals(timeArray));
    }

    /**
     * Finds the maximum number of consecutive arrivals from a 2-dimensional
     * array that represents the time of arrivals/departures of cars.
     *
     * @param timeArray     the input 2-dimensional array
     * @return              the max number of consecutive arrivals
     */
    public static int maxConsecArrivals(int[][] timeArray) {
        int max = 0;
        int count = 0;

        for (int[] time : timeArray) {
            if (time[1] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = (count > max) ? count : max;
        }

        return max;
    }

    /**
     * Uses selection sort to sort a 2-dimensional input array in ascending order.
     * @param arr   The input array
     */
    public static void sortArr(int[][] arr) {

        int[] tmp, min;
        int minPos;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j][0] < min[0]) {
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
