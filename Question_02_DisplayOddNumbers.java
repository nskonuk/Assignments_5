package Assignment_05;

public class Question_02_DisplayOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-2:

			Write a program that displays all odd numbers between 3-130 in the same line*/
		
		for(int i=4; i<130; i++) {
			
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
