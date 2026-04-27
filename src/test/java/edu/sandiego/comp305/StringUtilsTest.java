package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testReverseStringNormal() {
        assertEquals("cba", StringUtils.reverseString("abc"));
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    public void testReverseStringEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }
}
