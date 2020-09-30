package com.vadym.RegEx;

public class Test {
    public static void main(String[] args) {
        /*
        \\d - one number
        + -one or more
        * - zero or more
        ? - zero or one symbol until
        {2} - two symbols
        {2,} - two or more
        {2, 4} - two to four

         */
        String a = "-123";
        String b = "123";
        String c = "+123";


        System.out.println(a.matches("[-|\\+]?\\d+"));
        System.out.println(b.matches("(-|\\+)?\\d+"));
        System.out.println(c.matches("[-|\\+]?\\d+"));

        String d = "rdfddfFEFef123456";

        System.out.println(d.matches("[a-zA-Z]+?\\d+"));

        String e = "wew12345";
        System.out.println(e.matches("[^'][a-zA-Z]+?\\d+"));

        String url = "http://www.google.com";
        String url1 = "http://www.pravda.ua";

        System.out.println(url.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(url1.matches("http://www\\..+\\.(com|ua)"));


    }
}
