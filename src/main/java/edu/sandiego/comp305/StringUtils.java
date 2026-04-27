package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}