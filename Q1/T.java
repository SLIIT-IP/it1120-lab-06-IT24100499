import java.util.Scanner;


	public class IT24100499Lab6Q1{
		public static void main(String[] args){

	//getting the input from the keyboard
		Scanner scanner = new Scanner(System.in);

	//getting the input from the user
		System.out.println("Enter the number");
		double number = scanner.nextDouble();	
	
	//calculate the square of the number 
		double square = number * number;

	//calculate the square root of the number
		double squareroot = Math.sqrt(number);

	//print the square of the number
		System.out.println("Square of the Number is - " +square);

	//print the square root of the number
		System.out.println("Square root of the Number is - " +squareroot);
	

	}
}