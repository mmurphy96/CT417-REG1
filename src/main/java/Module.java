import java.util.ArrayList;

public class Module {
	//Module Name, ID (CT417), List of students).
	private String ModName;
	private String ModID;
	private final ArrayList<Student> StudentList;
	
	public Module (String ModName, String ModID){
		this.ModName = ModName;
		this.ModID = ModID;
		this.StudentList = new ArrayList<Student>();
		}
	
	public String getModName(){
		return this.ModName;
		}
	
	public String getModID(){
		return this.ModID;
	}
	public ArrayList<Student> getStudentList(){
		return this.StudentList;
	}
	public void addStudents(ArrayList<Student> StudentList){
		this.StudentList.addAll(StudentList);
	}
	public ArrayList<Student> getStudent(){
		return this.StudentList;
	}
}
