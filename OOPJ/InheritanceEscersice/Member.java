
// Question 2 

public class Member {
	private	String name;
	private int age;
	private String phone_no;
	private String address;
	private double salary;
	
	// Getter Setter
	
	
		
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
	
	public void printSalary() {
		System.out.println("This is salary : "+salary);
		
	}
	
}

class PrimeMembers extends Member{
	private int joiningYear;
	private double joiningFees;
	private boolean isActive;
	
	public int getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public double getJoiningFees() {
		return joiningFees;
	}
	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	void display() {
		System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhone_no());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());

        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Is Active: " + isActive);
	}
	
}
