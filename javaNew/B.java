package javaNew;

class A {
	int value1;
}
public class B extends A {
	int value2;
	public static void main(String[] args) {
//		 A ob= new A();
//		System.out.println(ob.value1 +" "+ ob.value2);
		
		B ob= new B();
		System.out.println(ob.value1 +" "+ ob.value2);
	}
}


//class CallerThread1 implements Callable<String> {
//	public String call() throws Exception { return "thread";}
//}
//public class Test {
//	public static void main(String[] args) {
//		for (int i = 0; i < args.length; i++)
//			System.out.print(i == 0 ? args[i] : " " + args[i]);
//		System.out.println(args.length);
//	}
//}

//
//public class TestReadFile {
//	public void readFile(String fName) throws IOException {
//		// Line n1
//		//Path p = Paths.get(new File(fName));
//		//Path p = new Path(fName);
//		//Path p = Paths.toPath(fName);
//		Path p = Paths.get(fName);
//		Stream<String> content = Files.lines(p);
//		content.forEach(s1 -> System.out.println(s1));
//	}
//	public static void main(String[] args) throws IOException {
//		TestReadFile trf = new TestReadFile();
//		trf.readFile("TestResult.txt ");
//	}
//}
//
//


//
//class Toy {
//	double price;
//	String color;
//	Toy(String color, double price) {
//		this.color = color;
//		this.price = price;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public String getColor() {
//		return color;
//	}
//
//}
//
//public class MainClass{
//	public static void main(String[] args) {
//		List<Toy> toys = new ArrayList<>();
//		toys.add(new Toy("red", 10));
//		toys.add(new Toy("yellow", 10));
//		toys.add(new Toy("red", 10));
//		double totalPrice = toys.stream().filter(e -> e.getColor() == "red").mapToDouble(a -> a.getPrice()).sum();
//		//double totalPrice = toys.stream().filter(e -> e.getColor() == "red").map(e -> e.getPrice()).sum();
//		System.out.println("Total Price of Red Toys: " + totalPrice);
//
//	}
//}

//
//class MyResource1 implements AutoCloseable {
//	public void close() throws IOException {
//		System.out.print("1 ");
//	}
//}
//class MyResource2 implements Closeable {
//	public void close() throws IOException {
//		throw new IOException();
//	}
//}
//public class TestRes {
//	public static void main(String[] args) {
//		try (MyResource1 r1 = new MyResource1();
//				MyResource2 r2 = new MyResource2();) {
//			System.out.print("T ");
//		} catch (IOException ioe) {
//			System.out.print("IOE ");
//		} finally {
//			System.out.print("F ");
//		}
//	}
//}
