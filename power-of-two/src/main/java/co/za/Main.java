package co.za;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(5));

    }

    private static boolean isPowerOfTwo(int n){
        for(int i = 0; i <= n/2; i++){
            if(n == (int) Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }
}