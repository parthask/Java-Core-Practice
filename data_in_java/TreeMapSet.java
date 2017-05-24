package data_in_java;

import java.util.*;
import java.util.Map.Entry;  
class TreeMapSet{  
	public static void main(String args[]){  
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();  

		map.put(0, 1);
		map.put(1,4);  
		map.put(4,3);  
		map.put(2,4);  

		//Now use Map.Entry for Set and Iterator  
		Set<Entry<Integer, Integer>> set=map.entrySet();  

		Iterator<Map.Entry<Integer,Integer>> itr=set.iterator();  
		while(itr.hasNext()){  
			Map.Entry e=itr.next();//no need to typecast  
			System.out.println(e.getKey()+" "+e.getValue());  
		}  

	}
}  

