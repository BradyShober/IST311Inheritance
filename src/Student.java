
public class Student extends Person implements Changeable{
	public static enum StudentStatus {
		
		FRESHMAN,SOPHOMORE,JUNIOR,SENIOR

	}
	
	StudentStatus status;

	Student(String fname, String lname, String phone, String email, StudentStatus status) {
		super(fname, lname, phone, email);
		this.status = status;
	}

	@Override
	public void changeName(String fname, String lname) {
		setFName(fname);
		setLName(lname);
		
	}
	
	@Override
	public String toString() {
		return "Class: " + Student.class.getName() + "  Name: " + fname + " " + lname + "  Status: " + status;
	}

}
