/*Assign and print the roll number, phone number and address of two students having
names "Sam" and "John" respectively by creating two objects of the class 'Student'*/
public class q3 {
public q3(int rollno,long pno,String add,String name){
	System.out.println("The nane is: "+name);
	System.out.println("The Rollno is: "+rollno);
System.out.println("The phone no is: "+pno);		
System.out.println("The address is: "+add);	
System.out.println(" ");
return;
}
	public static void main(String[] args) {
String n1 = "Sam";
String n2 = "Jhon";
int	rollno1=1;
int rollno2=2;
long pno1=979755664;
long pno2=987643210;
String add1="aaaa";
String add2="bbbb";
q3 s1 = new q3(rollno1,pno1,add1,n1);
q3 s2 = new q3(rollno2,pno2,add2,n2);
	}
}
