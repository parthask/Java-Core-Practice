package Practice_pack;
class Sumcls{
	int sum ( int a ){
		return (a+10);
	}
	int sum ( int a, int b ) {
		return ( a + b );
	}
	double sum ( double a ){
		double t= a+12;
		return t;
	}
}
public class MathodOverloading  {
	public static void main (String[] args) {
		Sumcls obj = new Sumcls ();
		System.out.println ( obj.sum ( 10 ) );
		System.out.println ( obj.sum ( 10, 40 ) );
		System.out.println ( obj.sum ( 10.4 ) );

	}
}

	