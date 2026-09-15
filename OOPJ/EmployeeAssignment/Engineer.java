
public class Engineer extends Employee {
	private double overtime;
	
	public Engineer(String name, String address, int age,String gender, double basicSalary, double overtime) {
		super(name , address , age , gender, basicSalary);
		
		this .overtime = overtime;
		
	}
	
	public double calculateSalary() {
		return getBasicSalary()+overtime;
		
	}
	
	public String getDesignation() {
	    return "Engineer";
	}
	
	public void display() {
		System.out.println("\n----- ENGINEER -----");
		super.display();
		System.out.println("Overtime      : " + overtime);
	}
}
