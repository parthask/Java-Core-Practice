package javaNew;

public class TrinaryOparetor {

	public static void main(String[] args) {
		Object obj1;
		Object obj2;
		
		if(true){
			obj1= new Integer(20);
			
		}else{
			obj1= new Double(10.50);
		}	
		System.out.println(obj1);
		
		obj2 = true?new Integer(20):new Double(10.50);
		System.out.println(obj2);
		
		
		test obj = new test();
		obj.setI(5);
		System.out.println(obj.getI());
		
	}
	
	
	
}
class test {
	
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}