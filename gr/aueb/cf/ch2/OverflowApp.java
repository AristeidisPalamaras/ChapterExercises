package gr.aueb.cf.ch2;

public class OverflowApp {

    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        result = num1 + num2;

        System.out.printf("%d\n", num1);
        System.out.printf("%d\n", result);

    }
}
