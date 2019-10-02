package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        greeting();
    }

    public static String greeting() {
        return "Hello, test suite";
    }

    public static int maxOfTwoNumbers(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int maxOfThree(int a, int b, int c) {
        if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else {
            return a;
        }
    }

    public static boolean isCharacterAVowel(String a) {
        String vowels = "AEIOUaeiou";
        return vowels.contains(a);
    }

    public static int numArgs(String... args) {
        return args.length;
    }

    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i -= 1) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
