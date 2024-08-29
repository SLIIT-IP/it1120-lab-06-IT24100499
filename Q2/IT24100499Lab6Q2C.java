import java.util.Scanner;

public class IT24100499Lab6Q2C{
	public static void main(String[] args){

	//getting the inputs from the user 
		Scanner scanner = new Scanner(System.in);

	//define the counter, sum and number of inputs
		int counter = 1;
		int sum = 0;
		int numberofinputs = 10;

	//promt to get the user inputs
		System.out.println("Enter the 10 numbers");

	
	//read 10 number outputs by using the while loop
		while (counter <= numberofinputs) {
			System.out.print("Enter the number " + counter + " :");
		 int number = scanner.nextInt();
		
	//calculate the sum of numbers
		sum += number;
		counter++;
		}
	
	
		
	//calculate the avarage of the numbers
		double avarage = sum / numberofinputs;

	//print the sum and the avarage od the numbers
		System.out.println("The sum of the number is " + sum);
		System.out.println("The avarage of the number is " + avarage);	
	
	} 
}