package javaNew;

public class Concert {
	static class PowerOutage extends Exception {}
	static class Thunderstorm extends Exception {}
	public static void main(String[] args) {
		try {
			new Concert().listen();
			System.out.println("a");
		} catch(PowerOutage | Thunderstorm e) {
			//e = new PowerOutage();
			System.out.println("b");
		} finally { System.out.println("c"); }
	}
	public void listen() throws PowerOutage, Thunderstorm{ }
}





//public class MultipleResources {
//	class Lamb implements AutoCloseable {
//		public void close() throws Exception {
//			System.out.print("l");
//		} }
//	class Goat implements AutoCloseable {
//		public void close() throws Exception {
//			System.out.print("g");
//		} }
//	public static void main(String[] args) throws Exception {
//		new MultipleResources().run();
//	}
//	public void run() throws Exception {
//		try (Lamb l = new Lamb();
////				System.out.print("t");
//				Goat g = new Goat();) {
//			System.out.print("2");
//		} finally {
//			System.out.print("f");
//		} } }




//
//public class Conductor {
//	static String s = "-";
//	class Whistle implements AutoCloseable {
//		public void toot() { s += "t"; }
//		public void close() { s += "c"; }
//	}
//	public static void main(String[] args) {
//		new Conductor().run();
//		System.out.println(s);
//	}
//	public void run() {
//		try (Whistle w = new Whistle()) {
//			w.toot();
//			s += "1";
//			throw new Exception();
//		} catch (Exception e) { s += "2";
//		} finally { s += "3"; } } }
//



//
//public class Train {
//	class RanOutOfTrack extends Exception { }
//	class AnotherTrainComing extends Exception { }
//	public static void main(String[] args) throws RanOutOfTrack,
//	AnotherTrainComing {
//		Train a = new Train();
//		try {
//			a.drive();
//			System.out.println("honk! honk!");
//		}catch(Exception e) {// insert code here
//			System.out.println("error driving    ");
//			throw e;
//		}
//	}
//	void drive() throws RanOutOfTrack, AnotherTrainComing {
//		throw new RanOutOfTrack();
//	} }







//public class BadIO {
//	public static void main(String[] args) {
//		BadIO a = new BadIO();
//		try {
//			a.fileBlowUp();
//			a.databaseBlowUp();
//			System.out.println("a");
//		}
//		catch(SQLException | IOException e) {// insert code here
//			System.out.println("b");
//		} catch (Exception e) {
//			System.out.println("c");
//		}
//
//	}
//	void databaseBlowUp() throws SQLException {
//		throw new SQLException();
//	}
//	void fileBlowUp() throws IOException {
//		throw new IOException();
//	}
//}
//


//public class AllGoesWrong {
//	public static void main(String[] args) {
//		AllGoesWrong a = new AllGoesWrong();
//		try {
//			a.blowUp();
//			System.out.println("a");
//		} catch (IOException   | SQLException e) {
//			System.out.println("c");
//		} finally {
//			System.out.println("d");
//		}
//	}
//	void blowUp() throws IOException, SQLException {
//		throw new SQLException();
//	}
//}


//
//public class Clumsy {
//	public static void main(String[] args) {
//		int j = 8;
//		assert(++j < 7);
//		System.out.println(j);
//		j=9;
//		assert(++j > 8): "hi";
//		System.out.println(j);
//		assert(j > 10): j=12;
//		System.out.println(j);
//		assert(j==12): doStuff();
//		assert(j==12): new Clumsy();
//	}
//	static String doStuff() { return ""; }
//}





//
//class Bad implements AutoCloseable {
//	String name;
//	Bad(String n) { name = n; }
//	public void close() throws IOException {
//		System.out.println("in close");
//		throw new IOException("Closing - " + name);
//		//System.out.println("out close");
//	}
//	}
//public class Suppressed {
//	public static void main(String[] args) {
//		try (Bad b1 = new Bad("1"); Bad b2 = new Bad("2")) {
//			// do stuff
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			for (Throwable t : e.getSuppressed()) {
//				System.err.println("suppressed:" + t);
//			} 	
//		}		
//	}
//}
//


//
//class One implements AutoCloseable {
//	public void close() {
//		System.out.println("Close - One");
//	} }
class Two implements AutoCloseable {
	public void close() {
		System.out.println("Close - Two");
	} }
//public class TryWithResources {
//	public static void main(String[] args) {
//		try (One one = new One(); Two two = new Two()) {
//			System.out.println("Try");
//			throw new RuntimeException();
//		} catch (Exception e) {
//			System.out.println("Catch");
//		} finally {
//			System.out.println("Finally");
//		} 
//	}
//}
//
//class One implements AutoCloseable {
//	public void close() throws IOException {
//		throw new IOException("Closing");
//	} }
//public class Suppressed {
//	public static void main(String[] args) {
//		try (One one = new One()) {
//			throw new Exception("Try");
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			for (Throwable t : e.getSuppressed()) {
//				System.err.println("suppressed:" + t);
//			}
//		} 
//	} 
//}