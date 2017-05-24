package Practice_pack;
class Cons_Over{
	public int a,b;
	Cons_Over(){
		System.out.println("first costructor");
	}
	Cons_Over(int x, int y){
		a=x;
		b=y;
		System.out.println("a+b= "+(x+y));		
	}
	Cons_Over(int c){
		a=b=c;
		System.out.println("a+b+c= "+(a+b+c));
	}
	
	void show(){
		System.out.println("show method");
		System.out.println("a+b= "+(a+b));	
	}	
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Cons_Over obj = new Cons_Over();
		//Cons_Over object;
		obj=new Cons_Over(10,20);
		obj= new Cons_Over(30);
		obj.show();
	}

}
