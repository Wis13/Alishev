package com.vadym.RegEx;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello1212there21212hey232322dude";
        String[] words2 = b.split("\\d+");
        System.out.println(Arrays.toString(words2));

        String c = "Hello there hey";
        String modifiedString =  c.replace(" ", ".");
        String modifiedString2 =  c.replaceAll(" ", ".");
        System.out.println(modifiedString);
        System.out.println(modifiedString2);

        String modifiedString3 = b.replaceAll("\\d+", "-");
        String modifiedString4 = b.replaceFirst("\\d+", "-");

        System.out.println(modifiedString3);
        System.out.println(modifiedString4);

    }
}
