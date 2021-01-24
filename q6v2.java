import java.util.Scanner;
public class q6v2 {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numbers: ");
		float q6a[] = new float[9];
	for(i=0;i<q6a.length;i++){
		q6a[i]=scan.nextFloat();	
	}
	System.out.println(" ");
	for(i=0;i<q6a.length;i++){
	System.out.println("The numbers are: "+q6a[i]);
	}
	System.out.println(" ");
	System.out.println("The lowest value is: "+q6a[0]);
	System.out.println(" ");
	System.out.println("The highest value is: "+q6a[q6a.length-1]);


	scan.close();
	}
}