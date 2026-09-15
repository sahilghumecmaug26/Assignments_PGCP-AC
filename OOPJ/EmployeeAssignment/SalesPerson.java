
public class SalesPerson extends Employee {

	private double commission;
	
	public SalesPerson(String name, String address, int age,String gender, double basicSalary, double commission) {
		super(name , address , age , gender , basicSalary );
		this.commission = commission;
		
	}
	
	public  double calculateSalary() {
		return getBasicSalary() + commission ;
	}
	
	public String getDesignation() {
	    return "Sales Person";
	}
	
	public void display() {
		System.out.println("\n----- SALES PERSON -----");
        super.display();
        System.out.println("Commission    : " + commission);
	}
}
