package data_in_java;

import java.util.*;

public class HashMap1{
	public static void main( String[] args )	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put( new Integer( 2 ), "two" );
		map.put( new Integer( 4 ), "four" );
		map.put( new Integer( 6 ), "six" );
		//		map.put( new Integer( 8 ), "eight" );
		System.out.println( map );
		System.out.println();

		System.out.println( "Enumerate the HashMap" );
		//Enumeration e = map.elements();
		//Get a set of the entries 
		Set set = map.entrySet(); 
		//Get an iterator 
		Iterator i = set.iterator(); 
		while ( i.hasNext() )
			System.out.println( i.next() );
		System.out.println();

		System.out.println( "Iterate through the HashMap" );
		//  for ( Iterator i = map.begin(); !i.atEnd(); i.advance() )
		//    System.out.println( i.get() + ", key = " + i.key() + ", value = " + i.value() );
		//  System.out.println();

		System.out.println( "Demonstrate access" );
		System.out.println( "map.get( 2 ) = " + map.get( new Integer( 2 ) ) );
		System.out.println( "map.get( 5 ) = " + map.get( new Integer( 5 ) ) );
		System.out.println( "map = " + map );
		System.out.println();

		System.out.println( "Show that duplicates cannot be added." );
		Object value = map.put( new Integer( 8 ), "eight" );
		if ( value != null )
			System.out.println( "Could not add 8." );
		else
			System.out.println( "Added 8." );
		System.out.println( "map = " + map );

		value = map.put( new Integer( 4 ), "FOUR" );
		if ( value != null )
			System.out.println( "Could not add 4." );
		else
			System.out.println( "Added 4." );
		System.out.println( "map = " + map );
		System.out.println();

		System.out.println( "Demonstrate modification" );
		map.put( new Integer( 4 ), "FOUR" );
		System.out.println( "map = " + map );
	}
}
