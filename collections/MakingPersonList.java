package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MakingPersonList {

	private Scanner scan = new  Scanner (System.in);
	public static void main(String[] args) {
		
		ArrayList <PersonInfo> personList = new ArrayList<>();
		
		personList.add(new PersonInfo("fname", "Lname", "0987654321" , "12/12/2010","abs@gmail.com", "sylhet, abnglasedf"));
		personList.add(new PersonInfo("fname1", "Lname1", "0987654321" , "12/12/2010","abs@gmail.com", "sylhet, abnglasedf"));
		personList.add(new PersonInfo("fname2", "Lname2", "0987654321" , "12/12/2010","abs@gmail.com", "sylhet, abnglasedf"));
		personList.add(new PersonInfo("fname3", "Lname3", "0987654321" , "12/12/2010","abs@gmail.com", "sylhet, abnglasedf"));
		personList.add(new PersonInfo("fname4", "Lname4", "0987654321" , "12/12/2010","abs@gmail.com", "sylhet, abnglasedf"));
		personList.add(new PersonInfo("fname5", "Lname5", "0987654321" , "12/12/2010","abs@gmail.com", "sylhet, abnglasedf"));
		
		for(PersonInfo person  : personList ){
		person.printByObject(person);
		}
	}
	
//	  public void scanByObject(PersonInfo obj){
//		  System.out.print(obj.setFirstName(scan.nextLine()) + " " + obj.getLastName() +" " + obj.getBirthday() +" " + obj.getPhnNo() + " " + obj.getEmailID() +" "+ obj.getAddress());
//		  System.out.println();
//	  }
}
