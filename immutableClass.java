package Assignment;

public final class immutableClass {
	final String name;
	final int rollNo;

	public immutableClass(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
}
