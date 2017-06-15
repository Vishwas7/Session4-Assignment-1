package Assignment1;



public class IfElse {

	public static void main(String[] args) {
		
		
		int n1 = 8, n2 = 6, n3 =5; 
		
		if(n1>= n2){ // First condition
			
			if(n1>= n3){  // Second condition
				
			System.out.println("Hightest number is : " + n1);
			}
			else{
				System.out.println("Hightest number is : " + n3);
			}
		}
		else{
			if (n2 >= n3){ // Third condition
				System.out.println("Hightest number is : " + n2); 
			}
			else{
				System.out.println("Hightest number is : " + n3);
			}
		}
		}
}

		