public class List4_8 {
    public static void main(String[] args) {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}