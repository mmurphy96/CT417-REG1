import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class StudentRegistrationTest {
//
	@Test
	public void test() {
		
		//Constructor from student Name, age, dob,id, 
		DateTime dob = new DateTime(1996,10,01,0,0,0);
		Student student = new Student("Michael Murphy",21,dob,11);
		assertEquals("Michael Murphy21", student.getUsername());
		System.out.println("Regestration Details" + student);
		//This should result in "Michael Murphy21". if so the test passes 
		
		//fix the print out
	}
}
