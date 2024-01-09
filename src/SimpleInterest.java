import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
         int T = sc.nextInt();
         double R = sc.nextDouble();
         double simpleinterested = (P*T*R)/100;
        System.out.println("simple interest is: "+simpleinterested);

    }

}
