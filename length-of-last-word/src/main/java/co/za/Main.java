package co.za;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        System.out.printf("Output: %d", lengthOfLastWord(input));
    }

    /**
     * Given an input string, this method will return the length of the last word in that string
     *
     * @param input is the input string
     * */
    private static int lengthOfLastWord(String input){
        int length = 0;
        String[] inputArray = input.split(" ");
        for (String s : inputArray) {
            if (!s.isEmpty()) {
                length = s.length();
            }
        }
        return length;
    }
}