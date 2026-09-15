abstract class Employee {
	
	private String name;
	private String address;
	private int age ;
	private String gender ;
	private double basicSalary;
	
	public Employee(String name , String address , int age , String gender , double basicSalary) {
		this.name = name ;
		this.address = address;
		this.age = age ;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract double calculateSalary() ;
	public abstract String getDesignation();
	
	public void display() {
		System.out.println("Name          : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Age           : " + age);
        System.out.println("Gender        : " + gender);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Total Salary  : " + calculateSalary());
	}
	
}
