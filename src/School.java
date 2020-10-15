
public class School {

	public static void main(String args[]) {
	Faculty faculty = new Faculty();
	//Students student = new Students();
	
	faculty.setFirst("Peter");
	faculty.setLast("Maine");
	faculty.printFirst();
	faculty.setDepartment("Mathematics");
	faculty.setOccupation("Teacher");
	faculty.printSalary();
	}
}
