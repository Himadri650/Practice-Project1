package javaprograms;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a for loop to print characters of a string
		
		// A string is class in Java
		// A string stores a series of characters
		// Every charecter in a string has a index number
		// index number starts with 0 (n-1)
		// string variable value will have a length that can be computed
		// The syntax to call methos already defined in a class is
		// objectname.methodname()
		
		String s1 = "Learning Java";
		
		//find the length of the string
		
		int len =s1.length();
		
		for(int i=0;i<s1.length();i++)
		{ 
			//System.out.println(i);  // this will just print the index of every charecter in the string
			System.out.print(s1.charAt(i));
		}
		
		

	}

}
