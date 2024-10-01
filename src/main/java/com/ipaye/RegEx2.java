package com.ipaye;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        // 1st way
        Pattern p = Pattern.compile("..m");
        Matcher m = p.matcher("alm");
        boolean b = m.matches();
        System.out.println(b);

        // 2nd way
        boolean b2 = Pattern.compile(".m").matcher(".m").matches();
        System.out.println(b2);

        // 3rd way
        boolean b3 = Pattern.matches(".m", "am");
        System.out.println(b3);

    }
}
