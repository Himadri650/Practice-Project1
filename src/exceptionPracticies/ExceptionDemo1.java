package exceptionPracticies;

public class ExceptionDemo1 {
	//System.out.println(name.length());
	
	// handel the exeption
	// can be done using try and catch block
	// syntax
	// try{
	// riskey code
	//)
	// catch{
	// handel execptionname obujec
	// }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		int j = 0;
		//String name= null;
		try {
			System.out.println("result" + i/j);
		}
		catch(ArithmeticException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("please do not give 0 as value of j");
		}
		
//	System.out.println("result" + i/j);
	System.out.println("result for addition" + i+j);
	System.out.println("result for multiplication" + i*j);
	System.out.println("result substaction" + (i-j));
		

	}

}
