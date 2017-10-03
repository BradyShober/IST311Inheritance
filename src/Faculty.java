import java.util.Date;

public class Faculty extends Employee implements Changeable {
	
	public static enum FacultyRank{
		ASSISTANT_PROFESSOR,ASSOCIATE_PROFESSOR,PROFESSOR
	}
	
	FacultyRank rank;

	Faculty(String fname, String lname, String phone, String email, String office, String officePhone,
			Date employment, FacultyRank rank) {
		super(fname, lname, phone, email, office, officePhone, employment);
		this.rank = rank;
	}

	@Override
	public void changeName(String fname, String lname) {
		setFName(fname);
		setLName(lname);

	}
	
	@Override
	public String toString() {
		return "Class: " + Faculty.class.getName() + "  Name: " + fname + " " + lname + "  Rank: " + rank;
	}

}
