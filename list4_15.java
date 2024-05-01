import java.util.Scanner;

public class list4_15 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");

        Scanner scanner = new Scanner(System.in);
        boolean keepAsking = true;
        while (keepAsking) {
            System.out.print("Enter a number: ");
            try {
                int num = scanner.nextInt();
                System.out.print("Enter another number: ");
                int den = scanner.nextInt();
                if (den == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                double result = (double) num / den;
                System.out.printf("The result is: %.2f%n", result);
                keepAsking = false;
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
                System.out.println("Please restart the program and try again.");
                keepAsking = false;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}