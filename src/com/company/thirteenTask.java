package com.company;

public class thirteenTask {
    public static void main(String args[]) {
        System.out.println(isPalindromString("anna"));
        System.out.println(isPalindromString("Kayak"));
        System.out.println(isPalindromString("James"));
        System.out.println(isPalindromString("Table"));
    }
    public static boolean isPalindromString(String text){
        String reverse = reverse(text).toLowerCase();
        if (text.toLowerCase().equals(reverse)){
            return true;
        }
        return false;
    }

    public static String reverse(String input){
        if (input == null || input.isEmpty()){
            return input;
        }
        String str = input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
        System.out.println(str);
        return str;
    }
}
