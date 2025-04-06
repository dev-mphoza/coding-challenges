package co.za;


public class Main {
    public static void main(String[] args) {

        //test values
        // Valid phone numbers: 987-123-4567, (123) 456-7890
        //Invalid phone numbers: 123 456 7890
        System.out.println(isPhoneNumberValid("123 456 7890"));
    }

    private static boolean isPhoneNumberValid(String phoneNumber){

        if((phoneNumber.charAt(3) == '-' && phoneNumber.charAt(7) == '-') || (phoneNumber.charAt(0) == '(' && phoneNumber.charAt(4) == ')' && phoneNumber.charAt(9) == '-')){
            return true;
        }
        return false;
    }
}