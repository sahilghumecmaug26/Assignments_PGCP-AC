// Question 5 & 6 


public class Employee {
//    String name;
//    int yearOfJoining;
//    double salary;
//    String address;
	
	double salary;
	int hours;
	
	
	void getInfo(double salary , int hours) {
		this.salary = salary;
		this.hours = hours;
		
	}
	
	void addSal() {
		if(salary < 500) {
			salary += 10 ;
		}
	}
	
	void addWork() {
		if(hours > 60) {
			salary += 5 ;
		}
	}
	
	void displaySalary() {
		System.out.println("Final Salary : $"+salary);
	}
}
