import java.util.Scanner;

public class q1v2 {

	public static void main(String[] args) {
	int i;
		System.out.println("enter 3 numbers:");
	Scanner scan = new Scanner(System.in);
	float a1[]=new float[3];
			for(i=0;i<a1.length;i++){
	a1[i] = scan.nextFloat();}
			scan.close();
		for( i=0;i<a1.length;i++){System.out.println("The numbers are: "+a1[i]);}
	for(i=a1.length-1;i>-1;i--){System.out.println("The numbers in reverse are: "+a1[i]);}
scan.close();
}
}
