import java.util.Scanner;
/*Create a class to store details of student like rollno, name, course joined and fee paid so far.
 *  Assume courses are C# and ASP.NET with course fees being 20000 and 30000.
Provide the a constructor to take rollno, name and course.
Provide the following methods:
•	Payment(amount)
•	Print()
•	DueAmount property
•	TotalFee property
*/
public class q5 {
	static float C=20000;
	static float ASP=30000;
	static String CH="C#";
	static String AP="ASP.NET";
	static float tf=0;
	static int cn;
	static String cc;
	static String na;
	static float pd=0;
	public static void main(String[] args) {
		print();
		totalf();
		pay();
		dm();
	
	}
	private static void dm() {
		float al=tf-pd;
		System.out.println("The due amount is: "+al);	
		return;
	}
	private static void totalf() {
		System.out.println("The total amount to be paid is: "+tf);
		return;
	}
	private static void pay() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the amount paid: ");
	pd=scan.nextFloat();
	System.out.println(" ");
	scan.close();
	return;
	}
	public static void print(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name: ");
		na=scan.next();
		System.out.println(" ");
		System.out.println("Enter the number of courses: ");
		cn=scan.nextInt();
		System.out.println(" ");
		if(cn==2){tf=C+ASP;}
		if (cn==1){	System.out.println("Which course:");
		System.out.println(" ");
		cc=scan.next();if(cc.equalsIgnoreCase(CH)||cc.equalsIgnoreCase(AP)){if (cc.equals("C#")){tf=C;}else{tf=ASP;}}
		else{System.out.println("Please try again and enter a valid course ");System.exit(1);}
		System.out.println(" ");
		scan.close();
		return;
	}
	}
}
