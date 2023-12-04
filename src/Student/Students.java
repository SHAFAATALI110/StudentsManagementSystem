package Student;

public class Students {
	private String name;
	private int rollnumber;
	private String grade;
	public Students(String name, int rollnum, String grade) {
		this.name = name;
		this.rollnumber = rollnum;
		this.grade = grade;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
