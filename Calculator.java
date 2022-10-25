import java.util.*;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply (int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide (int num1, int num2) {
		
		if (num2 == 0) {
			System.out.println("Your second number can't be 0.");
			return 0; } 
		else {
			return num1 / num2;
		}
	}
	
	public int square(int num1) {
		return num1 * num1;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner userInput = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int firstNumber = Integer.parseInt(userInput.nextLine());
		System.out.println("Enter second number: ");
		int secondNumber = Integer.parseInt(userInput.nextLine());
		
		int addition = calculator.add(firstNumber, secondNumber);
		int subtraction = calculator.subtract(firstNumber, secondNumber);
		int multiplication = calculator.multiply(firstNumber, secondNumber);
		int division = calculator.divide(firstNumber, secondNumber);
		int squared = calculator.square(firstNumber);
		System.out.println("Results:");
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
		System.out.println("First Number Squared: " + squared);
		
	}
	
	
}
	

