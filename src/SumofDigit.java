import java.util.*;
public class SumofDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt() ;
        while(num !=0){
            int digit = num %10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println(sum);
    }

}
