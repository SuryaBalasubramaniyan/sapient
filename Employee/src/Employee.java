
public class Employee {
	private int id;
	private String name;
	private double salary;
	private int vacationdays=30;
	
	public int getVacationdays() {
		return vacationdays;
	}
	public void setVacationdays(int vacationdays) {
		this.vacationdays = vacationdays;
	}
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void applyForLeave(int noOfDays) {
		if(noOfDays < this.vacationdays) {
			this.vacationdays-=noOfDays;
		}
		else {
			System.out.println("Maximum amount of leaves are taken");
		}
	}
}
