package co.za;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "";
        System.out.println(isPalindrome(input));

    }

    private static boolean isPalindrome(String input){
        int left = 0;
        int right = input.length() - 1;
        while(left <= right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}