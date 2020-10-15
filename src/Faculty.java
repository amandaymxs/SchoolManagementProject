
public class Faculty extends FacultyStudents{

	private int salary;
	private String department;
	
	/*---------------------------------
	 * Constructors
	 ----------------------------------*/
	public Faculty() {
		salary = 45000;
		department = "English";
		
	}
	
	public Faculty(int salary, String department) {
		setSalary(salary);
		setDepartment(department);
	}
	
	/*---------------------------------
	 * Setters
	 ----------------------------------*/
	public void setSalary(int salary) {
		if (salary < 0) {
			System.out.println("Error 14001: Salary cannot be negative.");
		} else {
		this.salary = salary;
		}
	}
	
	public void setDepartment(String department) {
		this.department = department.toUpperCase();
	}
	
	/*---------------------------------
	 * Getters
	 ----------------------------------*/
	public int getSalary() {
		return salary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	/*---------------------------------
	 * Printers
	 ----------------------------------*/
	public void printSalary() {
		System.out.println(salary);
	}
	
	public void printDepartment() {
		System.out.println(department);
	}
}
