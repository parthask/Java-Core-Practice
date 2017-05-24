package collections;

import java.util.*;

public class ArrayVSvector {
public static void addElement (List <Integer>List){
	for(int i=0;i<1000000;i++){
		List.add(i);
	}
}
public static void main(String[] args){
	final long strt2= System.nanoTime();
	addElement(new Vector <Integer>());
	final long end2 = System.nanoTime();
	System.out.println(strt2 +"  "+ end2);
	
	final long strt1= System.nanoTime();
	addElement(new ArrayList <Integer>());
	final long end1 = System.nanoTime();
	System.out.println(strt1 +"  "+ end1);
	
	
	
	System.out.println("ArrayList = "+ (end1 - strt1));
	System.out.println("vector = "+ (end2 - strt2));
	
}
}
