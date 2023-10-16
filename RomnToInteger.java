import java.util.Scanner;

public class RomnToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a roman number : ");
        String roman = sc.nextLine();
        sc.close();
        int result = RomnToInteger(roman);
        System.out.println(result);
    }

    private static int RomnToInteger(String roman) {
        int result = 0;
        int previousValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int value = 0;
            switch (c) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Roman number");
            }
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }

        return result;
    }
}
