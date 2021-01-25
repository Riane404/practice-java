import java.util.Scanner;
/*Write a program and input two integers in main and pass them to default constructor 
of the class. Show the result of the addition of two numbers.*/
public class q2 {
	 q2(float i,float j) {
		    float add = i+j;
		    System.out.println("The addition is: "+add);
		  }
	public static void main(String[] args) {  
Scanner s=new Scanner(System.in);
			    System.out.println("Enter the first value: ");
			    float a = s.nextFloat();
			    System.out.println(" ");
			    System.out.println("Enter the second value: ");
			    float b = s.nextFloat();
			    System.out.println(" ");
			    q2 o = new q2(a,b);
			    s.close();
			  }
	}

