package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {
        // Empty constructor to satisfy checkstyle
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
