package com.ipaye;

import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]", "acd"));
        System.out.println(Pattern.matches("[amn]", "a")); // (among a or m or n)
        System.out.println(Pattern.matches("[^amn]", "c")); // any character leaving a m and n
        System.out.println(Pattern.matches("[a-zA-S]", "I")); // any character which range between a to z and A to S
        System.out.println(Pattern.matches("[a-ds-u]", "b")); // any character that range between a-d or a-u
    }
}
