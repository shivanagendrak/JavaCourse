import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Find diameter of the circle.");
            System.out.println("2. Find area of the circle.");
            System.out.println("3. Find circumference of the circle.");
            System.out.println("4. Exit.");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double diameter = 2 * radius;
                    System.out.println("Diameter of the circle: " + diameter);
                    break;
                case 2:
                    double area = Math.PI * radius * radius;
                    System.out.println("Area of the circle: " + area);
                    break;
                case 3:
                    double circumference = 2 * Math.PI * radius;
                    System.out.println("Circumference of the circle: " + circumference);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
            sc.close();
        }

    }
}

