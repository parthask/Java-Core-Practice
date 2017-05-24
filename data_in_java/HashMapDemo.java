package data_in_java;
/*
The HashMap class in Java uses a hashtable to implement the Map interface. 
So the execution time of basic operations get( ) and put( ) remains constant even for large sets.
 */
import java.util.*;
public class HashMapDemo {
	static String newLine = System.getProperty("line.separator");
	public static void main(String[] args) {

		System.out.println("HashMap in Java");
		System.out.println("------------------------------" + newLine);
		HashMap<String, Double> map = new HashMap<String, Double>();

		System.out.println("Adding items to the HashMap.");
		map.put("UnitesStates", new Double(123.23));
		map.put("UnitedKingdom", new Double(256.32));
		map.put("Australia", new Double(857.99));
		map.put("India", new Double(568.74));
		System.out.println("------------------------------" + newLine);
		System.out.println("Map elements: "+map + newLine);

		System.out.println("Loop through the items in hashmap." + newLine);
		//first get set of the entries
		Set set = map.entrySet();
		//get an iterator
		Iterator i = set.iterator();
		//Display elements
		while(i.hasNext())
		{
			//Get the entry in the hashmap using .next() method
			Map.Entry mapEntry = (Map.Entry)i.next();
			System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue() + newLine);
		}

		System.out.println("Modify an existing hash set. Set India 9999.9" + newLine);
		//you can modify an existing entry in the hashmap using the put method
		//with the first parameter as the key you want to modify
		map.put("India",new Double(9999.9));

		//you can get the value of the key in the hashmap using .get method
		//passing in the key of the kashmap
		System.out.println("India's new value is : " + map.get("India") + newLine);
	}
}