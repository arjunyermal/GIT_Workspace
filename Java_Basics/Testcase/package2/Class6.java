package package2;

import java.util.Calendar;
import java.util.Date;

import package1.Class1;

public class Class6  extends Class1 {

	int a =2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Class6 C6 = new Class6();
		C6.x();
        

	     
		
	}
	@SuppressWarnings("deprecation")
	public void x()
	{
		
		System.out.println(this.a);
		
		Date A = new Date();
		
		Calendar C = Calendar.getInstance();
		
		System.out.println(A.toString());
	}

}