package Assignment_05;
import java.util.Scanner;
public class Queation_04_NumberMultiplyBy10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-4:

			Write a while loop that lets the user enter a number. 
			The number should be multiplied by 10, and the result stored in the variable product. 
			The loop should iterate as long as product contains a value less than 100.*/
		
		int num=0;
		while(num*10<100) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Pls enter a number:");
		 num=scan.nextInt();
		 int result=num*10;
		System.out.println("Result: "+result);
		}	
	}

}
