package collections;

public class PersonInfo {

	 private String firstName;
	    private  String lastName;
	    private  String birthday;
	    private String phnNo;
	    private String emailID;
	    private String address;
	   
	    
	  public  PersonInfo(String str1, String str2, String str3, String str4,String str5, String str6){
	    	this.setFirstName(str1);
	    	this.setLastName(str2);
	    	this.setBirthday(str3);
	    	this.setPhnNo(str4);
	    	this.setEmailID(str5);
	    	this.setAddress(str6);
	    }
	  
	  public void printByObject(PersonInfo obj){
		  System.out.print(obj.getFirstName() + " " + obj.getLastName() +" " + obj.getBirthday() +" " + obj.getPhnNo() + " " + obj.getEmailID() +" "+ obj.getAddress());
		  System.out.println();
	  }

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
}
