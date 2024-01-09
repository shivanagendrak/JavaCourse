import java.util.*;
public class NumbertoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Zero");
        } else {
            displayNumberInWords(number);
        }
        sc.close();
    }
    public static void displayNumberInWords(int num) {
        String[] words = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int unit = num % 10;
        int tensPlace = (num / 10) % 10;
        int hundredsPlace = (num / 100) % 10;

        if (hundredsPlace > 0) {
            System.out.print(words[hundredsPlace] + " Hundred ");
        }
        if (tensPlace == 1) {
            System.out.println(words[unit + 10]);
        } else {
            if (tensPlace > 1) {
                System.out.print(words[tensPlace] + " ");
            }
            if (unit > 0) {
                System.out.println(words[unit]);
            }
        }
    }
}
