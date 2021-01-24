import java.util.Scanner;
public class q7v2 {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numbers: ");
		float q7a[] = new float[9];
		
	for(i=0;i<q7a.length;i++){//enters no in array
		q7a[i]=scan.nextFloat();	
	}
	System.out.println(" ");
	for(i=0;i<q7a.length;i++){
	System.out.println("The numbers are: "+q7a[i]);//prints all no in array
	}
	float q7e[] = new float [q7a.length];//even no array
	float q7o[] = new float [q7a.length];//odd no array
	System.out.println(" ");
	for(i=0;i<q7a.length;i++){//loops array q7a and if the no in array is even the gets entered into q7e else q7o
if(q7a[i]%2==0){
	q7e[i]=q7a[i];}
	else{q7o[i]=q7a[i];}}
	System.out.println(" ");
	for(i=0;i<q7e.length;i++){//prints even no 
	if(q7a[i]%2==0){
	System.out.println("The even numbers are: "+q7e[i]);
	}}
	System.out.println(" ");
	for(i=0;i<q7o.length;i++){//prints odd no 
		if(q7a[i]%2!=0){
		System.out.println("The odd numbers are: "+q7o[i]+",");
	}}
	scan.close();
	}
	}