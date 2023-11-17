import java.util.*;

public class prime{

	public static void main(String[]args){

		long p;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many numbers you want to check: ");
		p = sc.nextLong();
		
		for( int i = 2; i < p+1; i++ ){
		
			for( int j = 2; j <= i/2; j++ ){
			
				if( i%j == 0){
					c = 1;
					break;
				}
			}
			if( c == 0 ){
				System.out.println( i + " is a prime number.");
			}
			else{
				System.out.println( i + " is not a prime number.");
			}
			c = 0;
		
		}
	}
}
		