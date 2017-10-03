import java.util.Date;

public class Staff extends Employee {
	
	String title;

	Staff(String fname, String lname, String phone, String email, String office, String officePhone, Date employment, String title) {
		super(fname, lname, phone, email, office, officePhone, employment);
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Class: " + Staff.class.getName() + "  Name: " + fname + " " + lname + "  Title: " + title;
	}

}
