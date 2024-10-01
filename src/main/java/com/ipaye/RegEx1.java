package com.ipaye;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".am");
        Matcher m = p.matcher("m");
      //  Boolean b = m.matches();
       // System.out.println(b);

        boolean b = Pattern.matches(".m", ".am");
        System.out.println(b);

        System.out.println(Pattern.matches("[amn]", "acd") );
        System.out.println(Pattern.matches("[amn]", "c"));
        System.out.println(Pattern.matches("[a-zA-S]", "T"));
        System.out.println(Pattern.matches("[MS][a-z]{5}", "Monica"));
        System.out.println(Pattern.matches("[xyz]?", "x"));
        System.out.println(Pattern.matches("[xyz]+", "x"));
        System.out.println(Pattern.matches("[xyz]*", "xyyza"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "1"));




    }
}