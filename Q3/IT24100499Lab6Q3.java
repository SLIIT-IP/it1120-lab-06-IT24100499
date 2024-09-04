import java.util.Scanner;

public class IT24100499Lab6Q3{
	public static void main(String[] args){
		//getting the inputs from the user 
			Scanner scanner = new Scanner(System.in);

		double sum = 0;
		int counter = 0;
		int number;
	
		//guid user to get the right inputs
			System.out.println("Enter positive integers (terminate input with -99)");

		//geting the inputs from the user by using the while loop
		while(true){ 
			System.out.println("Enter the number:");
			number = scanner.nextInt();
			
		//check if the number is -99		
		if(number== -99){
			break;
		    }	
		//check if the number is positive or negative
		if (number < 0 ){
		    	System.out.println("The entered number is invalid.Enter the positive number");
		    }		
		sum += Math.pow(number, 2);
		counter++;
		}
		

		//calculate and check the validation of the numnebers
		if(counter > 0){
			double RMS = Math.sqrt(sum / counter);
			System.out.println("The root mean square is (RMS)" + RMS);
		}else {
			System.out.println("please enter poitive intiger or -99 to terminate");		
		}
			





	
	


	
	}
}
