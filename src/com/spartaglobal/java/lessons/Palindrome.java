package com.spartaglobal.java.lessons;

public class Palindrome {
    // palindrome boolean solution
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        if (str.contains(" ")) {
            str.replace(" ", "");
        }
        int firstIndex = 0;
        int lastIndex = str.length() - 1;
        while (firstIndex < lastIndex) {
            if (str.charAt(firstIndex) != str.charAt(lastIndex))
                return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    public static void palindromeSentence(String str){
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
