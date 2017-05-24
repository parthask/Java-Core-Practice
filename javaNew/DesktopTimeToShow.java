package javaNew;

import java.time.LocalDateTime;

public class DesktopTimeToShow {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(LocalDateTime.now());
		
		String time = LocalDateTime.now().toLocalTime().toString();
		System.out.println(time);
	}
}
