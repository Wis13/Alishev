package com.vadym.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send my email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you\n" +
                "my address: tim@outlook.com. Let's stay in touch...";

        Pattern email = Pattern.compile("(\\w+)@(gmail|outlook)\\.(com|ua)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }
}
