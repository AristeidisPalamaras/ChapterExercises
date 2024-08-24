package gr.aueb.cf.test;


public class Test {
    public static void main(String[] args) {

        int[][] m = new int[3][3];

        m[1][1] = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) break;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
