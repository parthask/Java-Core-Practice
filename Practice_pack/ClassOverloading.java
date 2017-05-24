package Practice_pack;

class Supercls{
	Supercls(){
		System.out.println("supercls constructtor");
	}
	Supercls(int x){
		System.out.println("supercls constructtor + x: "+x);
	}
	int sum ( int a ){
		return (a+20);
	}
	int sum ( int a, int b ) {
		return ( a + b );
	}
	double sum ( double a ){
		double t= a+15;
		return t;
	}
}

public class ClassOverloading extends Supercls{
	ClassOverloading(){
		System.out.println("Subcls constructor");
	}
	ClassOverloading(int a){
		System.out.println("Subcls constructor + a: "+a);
	}
	int sum ( int a ){
		return (a+10);
	}
	int sum ( int a, int b ) {
		return ( a + b );
	}
	double sum ( double a ){
		double t= a+10;
		return t;
	}
	public static void main(String[] args) {
		ClassOverloading ob= new ClassOverloading(50);
		System.out.println(ob.sum(12));
		System.out.println(ob.sum(45.10));
	}
}
