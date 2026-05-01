package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void testReverseString(){
        assertEquals("olleH", StringUtils.reverseString("Hello"));
    }

    @Test
    void testEmptyReverseString(){
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testSingleCharReverseString(){
        assertEquals("b", StringUtils.reverseString("b"));
    }
}
