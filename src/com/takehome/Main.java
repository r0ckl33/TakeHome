package com.takehome;

public class Main {

    public static void main(String[] args) {
        String stringOne = "bubble gum";
        String stringTwo = "turtle ham";

        TransformString(stringOne, stringTwo);
    }

    /*
     *  Print the transformation of stringOne into stringTwo one letter at a time.
     *
     *  Stores stringOne in a StringBuilder and then loop through each individual character
     *  changing it to the corresponding positional character from stringTwo, then prints.
     *
     *  If the lengths of stringOne and stringTwo are not equal then the function will
     *  return a friendly message and then exit.
     *
     *  @param  stringOne  a string to be transformed
     *  @param  stringTwo  a string to be copied from
     */
    private static void TransformString(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()){
            System.out.println("The lengths of 'stringOne' and 'stringTwo' must be equal.");
            return;
        }

        StringBuilder newString = new StringBuilder(stringOne);

        System.out.println(newString);

        for (int i = 0; i < newString.length(); i++) {
            // Update a character in the StringBuilder.
            if (newString.charAt(i) != stringTwo.charAt(i)) {
                newString.setCharAt(i, stringTwo.charAt(i));

                System.out.println(newString);
            }
        }
    }

}