/*
public class Collage {
 static float a;
 static float total_time_spent_required;
 
		public static void time(){
			if(  a > total_time_spent_required){System.out.println("there seems to be no problem");}
			else{System.out.println("time spent in the department is not meeting the collage requirments");}
		}
	}
			*/
public class Collage {
 float a;
 float total_time_spent_required;
 
		public void time(float a1,float t){
			a=a1;
			total_time_spent_required=t;
			if(  a >= total_time_spent_required){System.out.println("there seems to be no problem");}
			else{System.out.println("time spent in the department is not meeting the collage requirments");}
		}
	}