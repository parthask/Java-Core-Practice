package javaNew;

class supperStaticBlock{
	static{
		System.out.println("Supper static block");
	}
	void method(){
		System.out.println("Supper method block");
	}
}
public class StaticBlock extends supperStaticBlock {
	static{
		System.out.println("sub static block");
	}
	void method(){
		System.out.println("Sub method block");
	}
public static void main(String[] args) {
	//supperStaticBlock supper = new supperStaticBlock();
	StaticBlock sub = new StaticBlock();
	//sub.method();
	//supper.method();
}
}

