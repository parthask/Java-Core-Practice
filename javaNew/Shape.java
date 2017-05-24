package javaNew;

public abstract class Shape {
	public static String color;
	public boolean fill;

	Shape(String color, boolean fill){

	}
	
	abstract double area ();

	public String toString() {
		return  this.color + this.fill ;
	}
}

