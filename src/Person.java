
public abstract class Person {

	String fname;
	String lname;
	String phone;
	String email;
	
	Person(String fname, String lname, String phone, String email){
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}
	
	void setFName(String fname) {
		this.fname = fname;
	}
	
	void setLName(String lname) {
		this.lname = lname;
	}
		
}
