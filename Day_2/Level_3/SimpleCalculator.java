import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();  
		
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();  
		
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();  

        double result;
        switch (op) {
            case "+":
                result = first + second;  
                break;
            case "-":
                result = first - second;  
                break;
            case "*":
                result = first * second;  
                break;
            case "/":
                if (second != 0) {
                    result = first / second;  
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                scanner.close();
                return;
        }

        // Print the result
        
		System.out.println("Result: " + result);  
    }
}
