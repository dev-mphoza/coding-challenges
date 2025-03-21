package co.za;

public class Main {
    public static void main(String[] args) {
        System.out.printf(reverseString("Hello and welcome!"));
    }
    private static String reverseString(String input){
        StringBuilder result = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}