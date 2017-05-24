package javaNew;

////Demonstrate assert.
//public class AssertDemo2 {
//	static int val = 3;
//	//Return an integer.
//	static int getnum() {
//		return val--;
//	}
//	public static void main(String args[])
//	{
//		try{
//		int n;
//		for(int i=0; i < 10; i++) {
//			n = getnum();
//			assert n > 0; // will fail when n is 0
//			System.out.println("n is " + n);
//		}
//		}catch(Exception ex){
//			System.out.println(ex);
//		}
//	}
//}

public class AssertionExample {
	public static void main(String[] args) {
		// get a number in the first argument
		//java -ea AssertionExample 8
		//int number = Integer.parseInt(args[0]);
		int number= 3;
		assert number <= 10; // stops if number > 10
		
		//    	int argCount = args.length;
		//    	 assert argCount == 5 : "The number of arguments must be 5";

		System.out.println("OK");

		System.out.println("Pass");

	}
}







