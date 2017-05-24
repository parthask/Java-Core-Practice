package Practice_pack;
class A{
	int i,j;
	int number=100;
	A(){
		System.out.println("its a constructor");
	}
	void show(){
		System.out.println("its a superclass method");
	}
	void display(){
		System.out.println("number: "+ number);
	}
}
class B extends A{
	int p, q,r,k;
	B(int a, int b, int c){
		k=a+b+c;
	}
	void show(){
		System.out.println("k: "+ k);
	}
}

class c extends A{
	int a,b,c;
	c(int a, int b, int c ){
		a=a;
		b=b;
		c=c;
		System.out.println("c: "+c);
	}
	
	void show (int a,int b){
		System.out.println(a+b);
	}
}
public class InheritancXm {

	public static void main(String[] args) {
		A superob= new A();
		B subob = new B(10, 20, 30);
		c subob2= new c(2, 3, 4);
		
		superob.show();
		subob.show();
		subob2.show();
		subob2.show(1,2);
		subob.display();
		System.out.println("number "+ subob.number);
	}

}
