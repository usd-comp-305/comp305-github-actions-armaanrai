package edu.sandiego.comp305;

/**
 * Utility class for String operations
 */
public class StringUtils {

    /**
     * Private constructor
     */
    private StringUtils(){

    }

    /**
     * Reverses a given string
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(final String input){
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(final String[] args){
        System.out.println(reverseString("Hello"));
    }
}
