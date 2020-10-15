
public class Students extends FacultyStudents{

	private int level;	//grade
	private double feesDue;
	private double feesPaid;
	
	/*---------------------------------
	 * Constructors
	 ----------------------------------*/
	public Students() {
		level = 1;
		feesDue = 0.00;
		feesPaid = 0.00;
	}
	
	public Students(int level, double feesDue, double feesPaid) {
		setLevel(level);
		setFeesDue(feesDue);
		setFeesPaid(feesPaid);
	}
	
	/*---------------------------------
	 * Setters
	 ----------------------------------*/
	public void setLevel(int level) {
		if (level <= 0) {
			this.level = 1;
			System.out.println("Error 11012: Level must be at least 1.");
		} else if (level > 10) {
			this.level = 9;
			System.out.println("Error 11011: Level cannot exceed 9.");
		} else {
			this.level = level;
		}
	}
	
	public void setFeesDue(double feesDue) {
		if (feesDue < 0) {
			System.out.println("Error 13002: There is a negative balance due."); //School owes student money for over-payment or refund
		} else {
			this.feesDue = feesDue;
		}
	}
	
	public void setFeesPaid(double feesPaid) {
		if (feesPaid < 0) {
			System.out.println("Error 12001: Fees paid cannot be negative.");
		} else if (feesPaid > this.feesDue) {
			System.out.println("Error 12002: Fees paid cannot exceed fees due.");
		} else if (feesPaid < (feesDue * 0.2)){
			System.out.println("Error 12003: Fees paid cannot be less than 20% of the fees due.");
		} else {
			this.feesPaid = feesPaid;
			this.feesDue -= feesPaid;
		}
	}
	
	/*---------------------------------
	 * Getters
	 ----------------------------------*/
	public int getLevel() {
		return level;
	}
	
	public double getFeesDues() {
		return feesDue;
	}
	
	public double getFeesPaid() {
		return feesPaid;
	}
	
	/*---------------------------------
	 * Printers
	 ----------------------------------*/
	public void printLelvel() {
		System.out.println(level);
	}
	
	public void printFeesDues() {
		System.out.println(feesDue);
	}
	
	public void printFeesPaid() {
		System.out.println(feesPaid);
	}
}
