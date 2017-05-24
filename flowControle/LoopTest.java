package flowControle;
public class LoopTest {
	public static void goLoop(int a) {

		outside: for (int i = 0; i < 3; i++) {
			inside: for (int j = 1; j < 3; j++) {
				System.out.print(j);
				if (a > 5) {
					continue outside;
				}

			}
		}

	}

	
	public static void main(String[] args) {
		int j = 10;
		switch (1) {
		case 20:
			j += 1;
		case 40:
			j += 2;
		default:
			j += 3;
		case 0:
			j += 4;
		}
		System.out.print(j);
	}

	
//	public static void main(String args[]) {
//		int a = 5;
//		outside: for (int i = 1; i < 3; i++) {
//			inside: for (int j = 1; j < 3; j++) {
//				System.out.print(j);
//				if (a++ > 6)
//					continue inside;
//			        break outside;
//			}
//		}
	}
	
//	public static void main(String args[]) {
//		int a = 15;
//		outside: for (int i = 0; i < 3; i++) {// line 4
//			inside: System.out.print(i); // line 5
//			for (int j = 1; j < 3; j++) {
//				if (a > 5) 
//				   continue inside;//line 8
//				break outside; // line 9
//			}
//		}
//	}
	
//	public static void main(String args[]) {
//		LoopTest.goLoop(15);
//
//	}


      