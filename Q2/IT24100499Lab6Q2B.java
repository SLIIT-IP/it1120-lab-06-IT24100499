import java.util.Scanner;

public class IT24100499Lab6Q2B{
	public static void main(String[] args){

	//getting keyboard outputs from the user
		Scanner scanner = new Scanner(System.in);

	//define the counter variable
		int counter = 1;

	//getting 10 numbers 
		int[] numbers = new int[10];
		System.out.println("Enter the 10 numbers.");

	//getting the 10 numbers by using the while loop
		while (counter <= 10){
		System.out.println("Enter the number " + counter );
			
		numbers[counter - 1] = scanner.nextInt();
		counter++;
		}	
		
	//print the numbers which are input by the user
		System.out.println("the numbers you were enter :");
		
		counter = 1;
		while (counter <= 10){
			System.out.print(numbers[counter - 1] + " ");
		counter++;
				
		}

		
	
	}	
}