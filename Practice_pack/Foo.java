package Practice_pack;
class Foo1{
	private int x,y;
	protected Foo1(int xx,int yy){
		System.out.println(xx +" "+ yy);
	}
}
public class Foo extends Foo1{
	int a=10;
	Foo(){
		super(2,3);
		System.out.println("constructor4");

	}
	{
		System.out.println("constructor2");
		System.out.println("constructor3");
	}

	public static void main(String[] args) {
		System.out.println("hgd");
		Foo f= new Foo();
	}
}
