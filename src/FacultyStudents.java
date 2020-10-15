import java.util.Random;

public class FacultyStudents {

	private String first;
	private String last;
	private String id;
	Random random = new Random();
	private int num;
	private String stringIDNum;
	private String status;
	private String occupation;

	/*---------------------------------
	 * Constructors
	 ----------------------------------*/
	public FacultyStudents() {
		first = "JANE";
		last = "SMITH";
		id = "SMIJ00001";
		occupation = "STUDENT";
		status = "FULL-TIME";
	}

	public FacultyStudents(String first, String last, String occupation, String status) {
		setFirst(first);
		setLast(last);
		setID(first, last);
		setOccupation(occupation);
		setStatus(status);
	}
	
	/*---------------------------------
	 * Setters
	 ----------------------------------*/
	public void setFirst(String first) {
		this.first = first.toUpperCase();
	}
	
	public void setLast(String last) {
		this.last = last.toUpperCase();
	}
	
	public void setID(String first, String last) {
		first = first.toUpperCase();
		last = last.toUpperCase();
		num = random.nextInt(100000);
		stringIDNum = Integer.toString(num);
		this.id = first.substring(0, 2) + last.charAt(0) +  stringIDNum;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation.toUpperCase();
		}
	public void setStatus(String status) {
		this.status = status.toUpperCase();
	}
	
	/*-----------------------------------
	 * Getters
	 ------------------------------------*/
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public String getID() {
		return id;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public String getStatus() {
		return status;
	}

	/*-------------------------------------
	 * Printers
	 -------------------------------------*/
	public void printFirst() {
		System.out.println(first);
	}
	
	public void printLast() {
		System.out.println(last);
	}
	
	public void printID() {
		System.out.println(id);
	}
	
	public void printOccupation() {
		System.out.println(occupation);
	}
	
	public void printStatus() {
		System.out.println(status);
	}
}
