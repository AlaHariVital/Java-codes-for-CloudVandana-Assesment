import java.util.Scanner;

public class PanagramChecker {
    public static void main(String[] args) {
        String ValidPanagram = "Valid Panagram -'The quick brown fox jumps over the lazy dog'";
        System.out.println(ValidPanagram);
        System.out.println("Enter the string you want to check :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        boolean isPanagram = isPanagram(input);
        if (isPanagram) {
            System.out.println("The given inpurt is Pangram.");
        } else {
            System.out.println("The given string is not a panagram.");
        }
    }

    private static boolean isPanagram(String input) {
        boolean[] isPresent = new boolean[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                isPresent[index] = true;
            }
        }
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
}
