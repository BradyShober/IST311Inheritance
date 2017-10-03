import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Student s1 = new Student("Brady", "Shober", "7173449376", "bvs5441@psu.edu", Student.StudentStatus.JUNIOR);
		Student s2 = new Student("Second", "Student", "555555555", "example@example.com", Student.StudentStatus.FRESHMAN);
		Student s3 = new Student("Third", "Student", "5556666666", "example2@example.com", Student.StudentStatus.SENIOR);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Staff t1 = new Staff("First", "Staff", "5557777777", "staff@example.com", "301", "5556555555", new Date(), "Manager");
		Staff t2 = new Staff("Second", "Staff", "5557777778", "staff2@example.com", "302", "5556555556", new Date(), "IT Support");
		Staff t3  =new Staff("Third", "Staff", "5557777779", "staff3@example.com", "303", "5556555557", new Date(), "Sales");
		list.add(t1);
		list.add(t2);
		list.add(t3);
		Faculty f1 = new Faculty("First", "Faculty", "5558888887", "faculty@example.com", "101", "5557555555", new Date(), Faculty.FacultyRank.ASSISTANT_PROFESSOR);
		Faculty f2 = new Faculty("Second", "Faculty", "5558888888", "faculty2@example.com", "102", "5557555556", new Date(), Faculty.FacultyRank.ASSOCIATE_PROFESSOR);
		Faculty f3 = new Faculty("Third", "Faculty", "5558888889", "faculty3@example.com", "103", "5557555557", new Date(), Faculty.FacultyRank.PROFESSOR);
		list.add(f1);
		list.add(f2);
		list.add(f3);
		Iterator<Person> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
