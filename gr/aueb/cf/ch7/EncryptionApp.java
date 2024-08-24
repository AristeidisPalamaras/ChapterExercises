package gr.aueb.cf.ch7;

/**
 * An encryption and a decryption method applied to "Hello world"
 */

public class EncryptionApp {
    public static void main(String[] args) {

        String inputStr = "Hello world";
        String encryptedStr = encrypt(inputStr);
        String decryptedStr = decrypt(encryptedStr);

        System.out.println(inputStr);
        System.out.println(encryptedStr);
        System.out.println(decryptedStr);
    }

    /**
     * Encrypts an input string by shifting every character to the next
     * ASCII character.
     *
     * @param inStr     the input string
     * @return          the encrypted string
     */
    public static String encrypt(String inStr) {

        String outStr = "";
        char inCh, outCh;

        for (int i = 0; i < inStr.length(); i++) {

            inCh = inStr.charAt(i);
            outCh = (inCh != ' ') ? (char) (inCh + 1) : inCh; // skip spaces

            outStr = outStr.concat(String.valueOf(outCh));
        }

        return outStr;
    }

    /**
     * Decrypts an input string by shifting every character to the previous
     * ASCII character.
     *
     * @param inStr     the input string
     * @return          the decrypted string
     */
    public static String decrypt(String inStr) {

        String outStr = "";
        char inCh, outCh;

        for (int i = 0; i < inStr.length(); i++) {

            inCh = inStr.charAt(i);
            outCh = (inCh != ' ') ? (char) (inCh - 1) : inCh; // skip spaces

            outStr = outStr.concat(String.valueOf(outCh));
        }

        return outStr;
    }
}
