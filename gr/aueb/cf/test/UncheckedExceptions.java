package gr.aueb.cf.test;

public class UncheckedExceptions {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println("main starts");
        System.out.println("main calls foobar");

//        try {
            foobar();
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println("main returns");

    }

    public static void foobar() {
        System.out.println("foobar starts");
        System.out.println("foobar calls foo");
//        try {
            foo();
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("foobar returns");
    }

    public static void foo() {
        System.out.println("foo starts");
        System.out.println("foo calls bar");

//        try {
            bar();
//        } catch (ArithmeticException e) {
//            System.out.println("rethrow" + e.getMessage());
//            throw e;
//        } finally {
//            System.out.println("foo returns");
//        }
            System.out.println("foo returns");

    }


    public static void bar() {
        System.out.println("bar starts");

//        try {
            int i = 1/0;
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            System.out.println("rethrow" + e.getMessage());
//            throw e;
//        } finally {
//            System.out.println("bar returns");
//        }
//            System.out.println("bar returns");


    }
}