import java.util.Scanner;
public class q2v2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	int	i=0;
	float a=0;
System.out.println("enter the three numbers: ");
float q2[]=new float[3];
for(i=0; i<q2.length;i++){
	q2[i]=s.nextFloat();
	a+=q2[i];
}
System.out.println("The sum is:"+a);
		s.close();
	}

}
