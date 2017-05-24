package algorithmsPractice;

import java.util.Scanner;

public class TwarOfHanui {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			System.out.println("Number of Rod: ");
			int n= scan.nextInt();
			char a= 'A';
			char b= 'B';
			char c= 'C';
			move(n,a,b,c);
		}
	}
	
	public static void move(int n, char from, char to, char temp) {
		if (n <= 0)
			return;
		move(n - 1, from, temp, to);
		System.out.println("Move disk "+n+" from " + from + " to " + to);
		move(n - 1, temp, to, from);
	}
}
