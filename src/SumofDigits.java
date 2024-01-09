import java.util.*;
public class SumofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

int sum = 0;
        for (int i = 0;i<n;i++){
            System.out.println(i);
            sum = sum +i;

        }

        System.out.println("sum of all digits in a given number: "+sum);
    }
}
