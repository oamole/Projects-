public class Insomniac{
	private String Name;
	private int ID;
	private int Duration_1;
	private int Duration_2;
	private int Duration_3;
	public static int Counter = 100;
	private static final int DEFAULT_DURATION = 8;
	
	public void setID(){
    ID = Counter; 
    Counter = Counter + 1;
	}

	public Insomniac() {
		setID();
		setName("DoeJohn");
		setDuration_1(DEFAULT_DURATION);
		setDuration_2(DEFAULT_DURATION);
		setDuration_3(DEFAULT_DURATION);
	}
public Insomniac(String newName, int newDuration_1,int newDuration_2, int newDuration_3) {
	setID();
	setName(newName);
	setDuration_1(newDuration_1);
	setDuration_2(newDuration_2);
	setDuration_3(newDuration_3);
	}
	public int getID(){
	return ID;
	}
	public String getName(){
		return Name;
	}
	public int getDuration_1(){
		return Duration_1;
	}
	public int getDuration_2(){
		return Duration_2;
	}
	public int getDuration_3(){
		return Duration_3;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setDuration_1(int Duration_1){
		this.Duration_1 = Duration_1;
	}
	public void setDuration_2(int Duration_2){
		this.Duration_2 = Duration_2;
	}
	public void setDuration_3(int Duration_3){
		this.Duration_3 = Duration_3;
	}
	public int convertToDays(){
		int days;
		days = 1;
		int numberOfHours;
		numberOfHours = 24;
		days = numberOfHours/24;
		return days;
	
	}

	public int remainderHrs(){
		int days;
		days = 1;
		int numberOfHours;
		numberOfHours = 24;
		days = numberOfHours/24;
		int r = days % numberOfHours;
		return r;
	}
	public String toString(){
		String msg = "Name" +Name + "ID" +ID + "Duration_1" +Duration_1 +"Duration_2" +Duration_2 +"Duration_3" +Duration_3;
		return msg;
	}
	

	
		
		
	

}

