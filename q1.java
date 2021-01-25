import java.util.Scanner;
//1.	Write a class having two variables and one member function which will return the area of the rectangle.
public class q1 {

	public static void main(String[] args) {
float i,j;
Scanner s = new Scanner(System.in);
System.out.println("Enter the length:");
i=s.nextFloat();
System.out.println(" ");
System.out.println("Enter the width: ");
j=s.nextFloat();
System.out.println(" ");
System.out.println("The area is: "+a(i,j));
s.close();
	}
	private static float a(float i,float j) {
	return(i*j);
	
	}

}
