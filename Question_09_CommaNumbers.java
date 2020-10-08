package Assignment_05;

public class Question_09_CommaNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-9:

			Write a program for the following logic:
			Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
			if end = 10, OUTPUT = 1, 3, 5, 7, 9
			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

			You should use while loop and if-else statements. Note that, 
			there should not be any comma after the last digit.*/
		//int end=10;
		//for(int i=1; i<=end; i++) {
		//	if(i%2!=0) {
			//	System.out.print(i+", ");
			//}
		//}
		int i=1; int end=11; String sep="";
		while(i<=end) {
			if(i%2!=0) {
				 
				System.out.print(sep+i);
				sep=", "; 
			}
		
			i++; 
			}
			
		}
		
		
	}


