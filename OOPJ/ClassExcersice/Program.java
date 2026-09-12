
public class Program {

    public static void main(String[] args) {
    	
    	// Question 1 

        // Part A
        Student s1 = new Student();

        s1.roll_no = 2;
        s1.name = "John";

        System.out.println("Part A:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.roll_no);


        // Part B
        Student s2 = new Student();
        Student s3 = new Student();

        // Student Sam
        s2.name = "Sam";
        s2.roll_no = 1;
        s2.phone_no = "9876543210";
        s2.address = "Mumbai";

        // Student John
        s3.name = "John";
        s3.roll_no = 2;
        s3.phone_no = "9876501234";
        s3.address = "Pune";


        System.out.println("\nPart B:");

        System.out.println("\nStudent 1:");
        System.out.println("Name: " + s2.name);
        System.out.println("Roll No: " + s2.roll_no);
        System.out.println("Phone No: " + s2.phone_no);
        System.out.println("Address: " + s2.address);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + s3.name);
        System.out.println("Roll No: " + s3.roll_no);
        System.out.println("Phone No: " + s3.phone_no);
        System.out.println("Address: " + s3.address);
        
        
        // Questipn 2 
    	
    	Triangle t1 = new Triangle(3,4,5);
    	int perimeter = t1.perimeterofTriangle();
    	System.out.println("Perimeter of triangle is :"+ perimeter);
    	
    	
    	// Question 3 
    	Rectangle R1 = new Rectangle(4,5);
    	R1.areaOfRectangle();
    	
    	// Question4
    	
    	Complex c1 = new Complex();
    	Complex c2 = new Complex();
    	
    	System.out.println("Enter the 1st real value : ");
    	c1.real=ConsoleInput.getInt();
    	System.out.println("Enter the 1st imaginary value : ");
    	c1.imaginary=ConsoleInput.getInt();
    	System.out.println("Enter the 2st real value : ");
    	c2.real=ConsoleInput.getInt();
    	System.out.println("Enter the 2st imaginary value : ");
    	c2.imaginary=ConsoleInput.getInt();
    	
    	c1.add(c2);
    	c1.subtract(c2);
    	c1.multipliCation(c2);
    	
    	
    	//Question 5 & 6 
    	
    	 Employee e1 = new Employee();
         Employee e2 = new Employee();
         Employee e3 = new Employee();

//         // Employee 1
//         e1.name = "Robert";
//         e1.yearOfJoining = 1994;
//         e1.salary = 50000;
//         e1.address = "64C- WallsStreat";
//
//         // Employee 2
//         e2.name = "Sam";
//         e2.yearOfJoining = 2000;
//         e2.salary = 60000;
//         e2.address = "68D- WallsStreat";
//
//         // Employee 3
//         e3.name = "John";
//         e3.yearOfJoining = 1999;
//         e3.salary = 55000;
//         e3.address = "26B- WallsStreat";
//         
//         
//         System.out.println("Name\t\tYear of joining\t\tSalary\t\tAddress");
//
//         System.out.println(e1.name + "\t\t" + e1.yearOfJoining + "\t\t\t"+ e1.salary + "\t\t" + e1.address);
//
//         System.out.println(e2.name + "\t\t" + e2.yearOfJoining + "\t\t\t" + e2.salary + "\t\t" + e2.address);
//        System.out.println(e3.name + "\t\t" + e3.yearOfJoining + "\t\t\t" + e3.salary + "\t\t" + e3.address);
//
//    
    	Employee e = new Employee();
    	
    	e.getInfo(450, 8);
    	e.addSal();
    	e.addWork();
    	
    	e.displaySalary();
    
    }
}
