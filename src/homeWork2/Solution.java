package homeWork2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println("Sum of strings lengths is          = " + sumOfStringsLengths(A, B));
        System.out.println("Is A alphabetical larger than B    = " + compareAlphabeticalString(A, B));
        System.out.println("Capitalize first letter of Strings = " + capitalizeFirstLetter(A, B));
        System.out.println("Two Strings are anagram            = " + areAnagram(A, B));

    }

    public static int sumOfStringsLengths(String first, String second) {
        return first.length() + second.length();
    }

    public static boolean compareAlphabeticalString(String first, String second) {
        return first.compareTo(second) <= 0;
    }

    public static String capitalizeFirstLetter(String first, String second) {
        if (first == null || second == null) {
            return first;
        }
        return first.substring(0, 1).toUpperCase() + first.substring(1) + " "
                + second.substring(0, 1).toUpperCase() + second.substring(1);
    }

    static boolean areAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        String firstLowerCase = first.toLowerCase();
        String secondLowerCase = second.toLowerCase();

        for (int i = 0; i < firstLowerCase.length(); i++) {
            char ch = firstLowerCase.charAt(i);
            if (numOfCopies(ch, firstLowerCase) != numOfCopies(ch, secondLowerCase)) {
                return false;
            }
        }
        return true;
    }

    private static int numOfCopies(char ch, String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result++;
            }

        }
        return result;
    }
}
