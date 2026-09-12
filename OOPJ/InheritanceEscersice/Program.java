
public class Program {
	public static void main(String []args) {
		
		//Question 1 
		
		Parent p = new Parent();
		Child c = new Child();
		
		
		p.parentMethod();
		c.chaildMethod();
		c.parentMethod();
		
		
		// Question 2 
		
		

		PrimeMembers pm = new PrimeMembers();


        System.out.println("Enter Name :");
        pm.setName(ConsoleInput.getString());


        System.out.println("Enter Age :");
        pm.setAge(ConsoleInput.getInt());


        System.out.println("Enter Phone Number :");
        pm.setPhone_no(ConsoleInput.getString());


        System.out.println("Enter Address :");
        pm.setAddress(ConsoleInput.getString());


        System.out.println("Enter Salary :");
        pm.setSalary(ConsoleInput.getDouble());


        System.out.println("Enter Joining Year :");
        pm.setJoiningYear(ConsoleInput.getInt());


        System.out.println("Enter Joining Fees :");
        pm.setJoiningFees(ConsoleInput.getDouble());


        System.out.println("Is Active (true/false) :");
        pm.setActive(ConsoleInput.getBoolean());


        System.out.println("\n----- Prime Member Details -----");
        pm.display();	
		
		
		
		// Question 3 
		
		System.out.println("Enter length of rectangle : ");
		int length = ConsoleInput.getInt();
		
		System.out.println("Enter breadth of rectangle : ");
		int breadth = ConsoleInput.getInt();
		
		Rectangle r = new Rectangle(length , breadth);
		
		r.perimeter();
		r.area();
		
		System.out.println("Enter side of a square : ");
		int side = ConsoleInput.getInt();
		
		Square s = new Square(side);
		s.area();
		s.perimeter();
		
		
		
		// Question 4 
		
		Square1 s1 = new Square1();
		
		s1.shapePrint();
		s1.rectanglePrint();
		s1.squarePrint();
		}
}
	
