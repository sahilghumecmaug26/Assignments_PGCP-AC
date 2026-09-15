
public class Manager extends Employee {
	private double hra;
	public Manager(String name , String address , int age , String gender , double basicSalary,double hra) {
		super(name,address,age,gender,basicSalary);
		this.hra = hra;
	}
	
	public double calculateSalary() {
		return getBasicSalary() +hra ;
	}
	
	public String getDesignation() {
	    return "Manager";
	}
	
	public void display() {
		System.out.println("\n----- MANAGER -----");
		super.display();
		System.out.println("HRA           : " + hra);
	}

}
