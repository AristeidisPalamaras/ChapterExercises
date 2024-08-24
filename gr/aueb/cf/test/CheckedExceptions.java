package gr.aueb.cf.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {

    public static void main(String[] args) {

        System.out.println("main starts");
        System.out.println("main calls foo");

        try {
            foo();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("main returns");

    }

    public static void foo() throws FileNotFoundException {
        System.out.println("foo starts");
        System.out.println("foo calls bar");

        try {
            bar();
        } catch (FileNotFoundException e) {
            System.out.println("rethrow" + e.getMessage());
            throw e;
        } finally {
            System.out.println("foo returns");
        }

    }


    public static void bar() throws FileNotFoundException {
        System.out.println("bar starts");

        try {
            File f = new File("");
            Scanner inp = new Scanner(f);
        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
            System.out.println("rethrow" + e.getMessage());
            throw e;
        } finally {
            System.out.println("bar returns");
        }


    }
}