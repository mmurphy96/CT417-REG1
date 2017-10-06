import java.util.ArrayList;

import org.joda.time.DateTime;

//Student Class - Name, age, dob, id, username
public class Student {

	private String name;
	private int age;
	private final DateTime dob;
	private int id;
	private String username;
	private CourseProgramme course;
	public Student (String name, int age, DateTime dob, int id){
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
	
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public DateTime getDOB(){
		return this.dob;
	}
	public int getID(){
		return this.id;
	}
	public String getUsername(){
		username = this.name+ this.age;
		return this.username;
	}
	public void addStutoCourse(CourseProgramme course){
		this.course = course;
	}
	public CourseProgramme getCourse(){
		return this.course;
	}
    public ArrayList<Module> getModules(ArrayList<Module> modules) {
       
    	ArrayList<Module> sModules = new ArrayList<Module>();
     
        for (int j=0; j< modules.size(); j++) {
                Module module = modules.get(j);

            if (module.getStudent().contains(this)) {
                sModules.add(module);
            }
        }
        return sModules;
}

}
