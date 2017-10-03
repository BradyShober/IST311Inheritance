import java.util.Date;

public class Employee extends Person {
	
	String office;
	String officePhone;
	Date employment;

	Employee(String fname, String lname, String phone, String email, String office, String officePhone, Date employment) {
		super(fname, lname, phone, email);
		this.office = office;
		this.officePhone = officePhone;
		this.employment = employment;
	}

}
