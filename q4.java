import java.util.Scanner;
/*Print the average of three numbers entered by the user by creating a class named 'Average' having
 *a function to calculate and print the average without creating any object of the Average class.*/
public class q4 {

	public static void main(String[] args) {
		float s=0;
		Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of entries:");
int e = scan.nextInt();
float ar[]=new float[e];
System.out.println(" ");
for(int i=0;i<e;i++){
System.out.println("Enter the number:");
	ar[i]=scan.nextFloat();	
}
System.out.println(" ");
for(int i=0;i<e;i++){
s+=ar[i];
	
}
float a=s/e;
System.out.println("The average is: "+a);
scan.close();
	}
}
