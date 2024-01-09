import java.util.*;
public class DecimalToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number (1 to 3999): ");
        int decimalNumber = sc.nextInt();
        if (decimalNumber < 1 || decimalNumber > 3999) {
            System.out.println("Decimal number should be between 1 and 3999.");
            return;
        }
        String romanNumeral = convertToRoman(decimalNumber);
        System.out.println("Roman numeral for " + decimalNumber + " is: " + romanNumeral);

        sc.close();
    }
    public static String convertToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            } else {
                i++;
            }
        }
        return result.toString();
    }
}
