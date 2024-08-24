package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Use the BigInteger class to prevent overflow
 */

public class BigIntegerApp {

    public static void main(String[] args) {

        BigInteger myBigNum1 = new BigInteger("12345678900987654321");
        BigInteger myBigNum2 = new BigInteger("2");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.printf("%d\n", myBigNum1);
        System.out.printf("%d\n", result);
    }
}
