package DS;

public class Student {
	int empid;
	int salary;
	public Student() {
		
	}
	public Student(int empid,int salary) {
		this.empid=empid;
		this.salary=salary;
	}
	public void setempid(int empid) {
		this.empid=empid;
	}
	public int getempid() {
		return empid;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public int getsalary() {
		return salary;
	}
}
