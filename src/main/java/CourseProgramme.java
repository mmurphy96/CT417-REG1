import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
	//Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates). Start and end dates should use Joda Time 
	private String courseName;
	private ArrayList<Module> ModulesList;
	private DateTime StartDate;
	private DateTime EndDate;
	
	public CourseProgramme(String courseName, ArrayList<Module> ModulesList, DateTime SD, DateTime ED){
		this.courseName = courseName;
		this.ModulesList = ModulesList;
		this.EndDate = ED;
		this.StartDate = SD;
	}
	public String getCourseName(){
		return this.courseName;
	}
	public void setCourseName(String name){
		this.courseName = name; 
	}
	public ArrayList<Module> getModulesList(){
		return this.ModulesList;
		
	}
	   public void setModuleList(ArrayList<Module> modulelist){
           this.ModulesList = modulelist;
		
	}
	public DateTime getStartDate(){
		return this.StartDate;
	}
	public DateTime getEndDate(){
		return this.EndDate;
	}
	
	public void setEndDate(DateTime EndDate){
		this.EndDate = EndDate;
	}
	public void setStartDate(DateTime StartDate){
			this.StartDate = StartDate;
	}
}
