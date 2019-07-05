
public class Client {
	public static void main(String[] args) {
		Employee surya=new Employee(12,"surya",45_000);
		System.out.println("Initial vacation days"+surya.getVacationdays());;
		surya.applyForLeave(20);
		System.out.println("After applying fr leaves"+surya.getVacationdays());;
		surya.applyForLeave(20);
	}
}
