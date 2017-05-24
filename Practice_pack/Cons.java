package Practice_pack;

public class Cons {
	protected Cons(){
		this(2,3);
//		this(7,5,8);
		System.out.println("With out parameter");
	}
	protected Cons(int x, int y){
		this(7,5,8);
		System.out.println("With parameter x, y = "+ x+" , "+y);
	}
	protected Cons(int x, int y, int z){
		System.out.println("With parameter x, y, z = "+ x+" , "+y+" , "+z);
	}
	public static void main(String[] args) {
		System.out.println("constructor!!!");
		Cons obj = new Cons ();
	}
}
