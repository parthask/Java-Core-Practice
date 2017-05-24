package javaNew;

import java.util.Scanner;

public class Hacker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		String time = in.next();
		String t="";
		String ampm ;
		String s="";
		String str [] = time.split(":");
		if(str[2].contains("PM")){
			ampm= "PM";
			
		}else{
			ampm= "AM";
		}
		String ss[]= str[2].split("");
		s+=ss[0]+ss[1];
		
		
		if(ampm.equals("AM")){
			if(str[0].equals("12")){
				t= t+"00:"+str[1]+":"+s;
			}else{
				t= t+str[0]+":"+str[1]+":"+s;
			}
		}else{
			if(str[0].equals("12")){
				t= t+"12:"+str[1]+":"+s;
			}else{
				int x= Integer.parseInt(str[0]);
				x= x+12;
				t= t+Integer.toString(x)+":"+str[1]+":"+s;
			}
		}


		System.out.println(t);
	}
	}
}
