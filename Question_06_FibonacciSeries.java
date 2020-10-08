package Assignment_05;
import java.util.Scanner;
public class Question_06_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-6:

			Write a program to print Fibonacci series of n terms where n is
			declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......*/
		
		
		        int n, a = 0, b = 0, c = 1;
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter a number n:");
		        n = scan.nextInt();
		       
		        for(int i = 1; i <= n; i++)
		        {
		            a = b;
		            b = c;
		            c = a + b;
		            System.out.print(a+" ");
		        }
		}
	}


