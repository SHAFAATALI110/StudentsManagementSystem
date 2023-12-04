package StudentmanagmentSystem;
import Student.Students;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagmentSystem  {
	public ArrayList<Students>student;
	private Scanner scan;
	public StudentManagmentSystem() {
	student = new ArrayList<Students>();
	scan = new Scanner(System.in);
	}
	public static void main(String[] args) {
		StudentManagmentSystem system = new StudentManagmentSystem();
		system.run();
	}
	public void display() {
		System.out.println(" Enter your choise ");
		System.out.println(" 1: Add student ");
		System.out.println(" 2: Remove student ");
		System.out.println(" 3: Sreach student ");
		System.out.println(" 4: Display all ");
		System.out.println(" 5: Exit ");
	}
	public void run() {
		boolean running = true;

		while(running) {
		display();
		int choise = scan.nextInt();
			switch(choise) {
			case 1:
				addStudents();
				break;
			case 2:
				removeStudents();
				break;
			case 3:
				searchStudents();
				break;
			case 4:
				displayAll();
				break;
			case 5:
				running = false;
				System.out.println("Exiting...");
				break;
		 default:
				System.out.println("Invalid choise");
				break;		
			}
		}
	}
	
public void addStudents() {
	System.out.println("Enter Student name");
	String name = scan.next();
	System.out.println("Enter Student roll number");
	int rollnum = scan.nextInt();
	System.out.println("Enter Student grade ");
	String grade = scan.next();
	if (name.isEmpty() || grade.isEmpty() ) {
		System.out.println("Invalid Name or Grade");
	} else {
		Students newStudent = new Students(name, rollnum, grade);
		student.add(newStudent);
	}
}
public void removeStudents() {
	boolean repeat = true;
	while(repeat) {
	System.out.println("Enter Student roll number");
	int rollnum = scan.nextInt();
	//boolean removed = false;
	for (Students students : student) {
	if (rollnum == students.getRollnumber() ) {
		student.remove(students);
		//removed = true;
		System.out.println("Removed successfully");
	//	repeat = false;
		break;
	}  
	else   {
		System.out.println("Roll number not exest ");
		repeat = true;
	}
	}
}
}
public void searchStudents() {
	System.out.println("Enter Student roll number");
}
public void displayAll() {
	for (Students students : student) {
		System.out.println("Name: "+students.getName()+"Roll Name: "+students.getRollnumber()+"Grade: "+students.getGrade());

	}
  }
}
