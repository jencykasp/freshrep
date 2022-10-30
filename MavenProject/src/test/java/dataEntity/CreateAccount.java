package dataEntity;

public class CreateAccount {
	
	String Title;
	String FirstName;
	String LastName;
	String Email;
	String Password;
	String Date; //dd/January/yyyy
	public boolean SignUpforNewsLetter = false;
	public boolean ReceiveSpecialOff = false;
	
		
	public String getTitle() {
	    return Title;
	 }
 
	public void setTitle(String value) {
	    this.Title = value;
	}
	
	public String getFName() {
	    return FirstName;
	 }
 
	public void setFName(String value) {
	    this.FirstName = value;
	}
	public String getLName() {
	    return LastName;
	 }
 
	public void setLName(String value) {
	    this.LastName = value;
	}
	public String getEmail() {
	    return Email;
	 }
 
	public void setEmail(String value) {
	    this.Email = value;
	}
	
	public String getPassword() {
	    return Password;
	 }
 
	public void setPassword(String value) {
	    this.Password = value;
	}
	
	public String getDate() {
	    return Date;
	 }
 
	public void setDate(String value) {
	    this.Date = value;
	}
}
