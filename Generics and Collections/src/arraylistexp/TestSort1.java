package arraylistexp;
import java.util.*;
public class TestSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = new ArrayList<String>();
		cities.add("Kanpur");
		cities.add("London");
		cities.add("Chicago");
		cities.add("New York");
		Collections.sort(cities);
		System.out.println("Sorted cities: " + cities);
	}

}
