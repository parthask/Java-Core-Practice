package collections;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 20");	
		subject.setState(15);
		System.out.println("Second state change: 30");	
		subject.setState(10);
	}
}