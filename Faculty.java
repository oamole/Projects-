package subclass;
import superclass.CommunityMember;
import java.util.Vector;
public class Faculty extends CommunityMember{
    private String academicDept;
	private Vector<String> courses;

	//default constructor
	public Faculty(){
	   this.academicDept="academic";
	   this.courses=new Vector<String>();//empty list of courses
    }
    public Faculty(String new_dept,Vector<String> new_courses){
      this.academicDept = new_dept;
      this.courses = new_courses;
    }
    public Faculty(String new_name,int new_age){
      super(new_name,new_age,1000);
      this.academicDept = "academic";
      this.courses = new Vector<String>();

    }

	//accessor methods
	public String getAcademicDept(){
		return this.academicDept;
	}

	public Vector getCourses(){
		return this.courses;
	}

	//mutator methods

	public void setAcademicDept(String dept){
		this.academicDept=dept;
	}
	public void setCourses(Vector courses){
		this.courses=courses;
	}

	//other methods
	public String listCourses(){
		String retString="";
		Vector courses = this.getCourses();
		if(courses==null){
			retString="No courses taught\n";

		}else if(courses.size()==0){
			retString="No courses taught\n";
		}else{
			for(int i=0;i<courses.size();++i){
				retString = retString + courses.get(i) + "\n";
			}
		}

		return retString;
	}

}
