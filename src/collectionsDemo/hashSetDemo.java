package collectionsDemo;

import java.util.HashSet;

public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hash set is implementing set interface 

		HashSet<String> cities = new HashSet<>();
		
		
		cities.add("London");
		cities.add("Newyork");
		
		cities.add("Paris");
		cities.add("hydrabad");
		cities.add("delhi");
		
		for(String t: cities) {
			System.out.println(t);
			
			System.out.println(cities.size());
			
			System.out.println(cities.contains("tokyo"));
		}
			
	}

}
