
import java.util.Scanner;
public class q3v2 {

	public static void main(String[] args) {
int i=0;
		Scanner q3 = new Scanner(System.in);
float q3a[]=new float[3];
float q3a1[]=new float[3];
System.out.println("Enter the numbers: ");
for(i=0;i<q3a.length;i++){
q3a[i]=q3.nextFloat();
q3a1[i]=q3a[i];
}
System.out.println(" ");
for(i=0;i<q3a.length;i++){
System.out.println("The numbers entered are: "+q3a[i]);
}
System.out.println(" ");
for(i=0;i<q3a1.length;i++){
System.out.println("The numbers copied are: "+q3a1[i]);
}
q3.close();
}
}
