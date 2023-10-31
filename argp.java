public class argp{

	static void prime(int a){
		
		int p = 0;
		for( int i = 2; i <= a/2; i++ ){
			if( a % i == 0){
				p=1;
				break;
			}
		}
		if( p == 0){
			System.out.println( a + " is a prime number");
		}
	}	

	public static void main(String[]args){
		
		int a = args.length;
		for( int i = 0; i < a; i++ ){
			System.out.print( args[i] + " ");
		}
		System.out.println( "the above are the entered arguments. ");
		for( int i = 0; i < a; i++ ){
			int s = Integer.parseInt(args[i]);
			prime(s);
		}
	}
}		