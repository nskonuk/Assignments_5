package Assignment_05;

public class Question_10_PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-10:

			Print following output using nested for loops:
			1
			22
			333
			4444
			55555
			666666
			7777777*/
		int n=8,j=1;
		for(int i=1; i<=n;i++) {
			
			for(j=1; j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
