package Assignment_05;

public class Questions_08_SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Question-8:

			Write a program to calculate the sum of the numbers from 1 till upper bound.
			If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
			If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
			If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

			You should use a while loop.*/
		int i=0,n=100, sum=0;
		while(i<=n ) {
			
				sum+=i;
				i++;
				
				
			}
		System.out.println(sum);
		}
		
	}


