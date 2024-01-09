import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = sc.nextInt();
        printPascalsTriangle(numRows);
        sc.close();
    }
    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int coefficient = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coefficient + " ");
                coefficient = coefficient * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
