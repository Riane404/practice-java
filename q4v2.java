import java.util.Scanner;
public class q4v2 {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numbers: ");
		float q4a[] = new float[9];
	for(i=0;i<q4a.length;i++){
		q4a[i]=scan.nextFloat();	
	}
	System.out.println(" ");
	for(i=0;i<q4a.length;i++){
	System.out.println("The numbers are: "+q4a[i]);
	}
for(i = 0; i < q4a.length; i++) {  
    for(int j = i + 1; j < q4a.length; j++) {  
        if(q4a[i] == q4a[j])  
            System.out.println( "The duplicated numbers are:"+q4a[j]);  //mam how exactly does this code work, could you explain in class
    }  
}
		scan.close();
}
}
