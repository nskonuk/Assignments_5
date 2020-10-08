package Assignment_05;

public class Question_14_DrawPattern {

	public static void main(String[] args) {
		
/*Question-14:

Write nested loop to draw this pattern

##
#  #
#   #
#    #
#     #
#      #
#        #*/
		int rows=7; 
		for (int i=1; i<=rows; i++) {
			
			 System.out.print("#");
            for(int j=1; j<i; j++) {
				
            	System.out.print(" ");
            
			}
            System.out.println("#");
		}
		
	
	}

}
