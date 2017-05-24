package data_in_java;
import java.util.*;
//import org.apache.commons.collections.MultiMap;
//import org.apache.commons.collections.map.MultiValueMap;
/**
 * HashMap - Single Key and Multiple Values using Apache Commons Collections
 *
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class SingleKeyMultipleValueUsingApacheCollections {
	public static void main(String[] args) {
		// create multimap to store key and values
		//Map <String , String > multiMap= new 
		// MultiMap multiMap = new MultiValueMap();
		Map<String, String> multiMap = new HashMap<String, String>();
		// put values into map for A
		multiMap.put("A", "Apple");
		multiMap.put("A", "Aeroplane");
		// put values into map for B
		multiMap.put("B", "Bat");
		multiMap.put("B", "Banana");
		// put values into map for B
		multiMap.put("B", "Bat");
		multiMap.put("B", "Banana");
		// put values into map for C
		multiMap.put("C", "Cat");
		multiMap.put("C", "Car");
		// retrieve and display values
		System.out.println("Fetching Keys and corresponding [Multiple] Values n");
		// get all the set of keys
		Set<String> keys = multiMap.keySet();
		// iterate through the key set and display key and values
		for (String key : keys) {
			System.out.println("Key = " + key);
			System.out.println("Values = " + multiMap.get(key) + "n");
		}
	}
}