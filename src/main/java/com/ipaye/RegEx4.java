package com.ipaye;

import java.util.regex.Pattern;

public class RegEx4 {
    public static void main(String[] args) {

        // if the regular expression accept 6 character sequence, starting with m or s
        System.out.println(Pattern.matches("[MS] [a-z] {5}", "Monica"));
        System.out.println(Pattern.matches("[MS] [a-z] {5}", "Sameer"));
        System.out.println(Pattern.matches("[MS] [a-z] {5}", "Anadi"));
        System.out.println();

        //Quantifier examples
        // [X]?, X occurs once or not at all
        System.out.println(Pattern.matches("[xyz]?", "x"));
        System.out.println(Pattern.matches("[xyz]", "xxyyyzz"));
        System.out.println();

        //[x]+, X occurs once or more time
        System.out.println(Pattern.matches("[xyz]", "x"));
        System.out.println(Pattern.matches("[xyz]+", "xxx"));
        System.out.println(Pattern.matches("[xyz]+", "xyyzz"));
        System.out.println();

        //[x]*, X occurs zero or more times
        System.out.println(Pattern.matches("[xyz]*", "xyyza"));
        System.out.println(Pattern.matches("[xyz]*", "xxyyz"));
        System.out.println();

        //Metacharacters examples
        // "\d", if the character sequence consists of any digit
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "1a"));
        System.out.println();

        // "\D", if the character sequence consists of any character
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "1a"));
        System.out.println(Pattern.matches("\\D", "a"));

        // to match length of characters
        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "monica"));
    }
}
