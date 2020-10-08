package Assignment_05;

public class Question_13_Chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Question-13:

			Print following chessboard using nested for loops.
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W*/
		char B='B'; char W='W';
		for(int i=1; i<=4; i++) {
			
		
			for(int j=1; j<=4;j++){
				
					
					System.out.print(W+" ");
					System.out.print(B+" ");
			}
			
			System.out.println();		
			for(int j=1; j<=4;j++){	
				System.out.print(B+" ");
				System.out.print(W+" ");
		}
			System.out.println();
		}
	}				
					
}			
		
				 
		

	


