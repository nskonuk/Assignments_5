package Assignment_05;

public class Question_11_PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-11:

			Print the following output using nested for loops.

			4       3       2      1

			     3       2      1

			         2       1*/
		
		
		int i,j,n=8;
		int m=n;
		for(i=1;i<=n; i++) {
			
			for(j=1; j<i; j++) {
				System.out.print(" ");
				
		}
		 for(int x=m; x>=1; x--) {
			 System.out.print(x+" ");
		 }
		System.out.println();
		m--;
	}
	}
}
