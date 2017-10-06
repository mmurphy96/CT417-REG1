import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class StudentRegistrationTest {

	@Test
	public void test() {
		
		//Note - Constructor from student - Name, age, dob,id, 
		DateTime dob = new DateTime(1996,10,01,12,10,04);
		Student student = new Student("MichaelMurphy",21,dob,11);
		
		String expected = "MichaelMurphy21";
	
		assertEquals(expected, student.getUsername());
		System.out.println("\n Registration Details" + student.toString());
		//The username should result in "MichaelMurphy21" 
		
	}
}
