

public class Program {
	
	static Employee[] employees = new Employee[100];
	
	static int count =0;

	
	public static void main(String []args) {
		int choice;
		
		do {
			 	System.out.println("\n======================================");
	            System.out.println("       EMPLOYEE MANAGEMENT SYSTEM");
	            System.out.println("======================================");
	            System.out.println("1. Add an Employee");
	            System.out.println("2. Display");
	            System.out.println("3. Sort");
	            System.out.println("4. Save to File");
	            System.out.println("5. Load from File");
	            System.out.println("6. Exit");
	            System.out.println("======================================");

	            System.out.print("Enter your choice : ");
	            
	            choice = ConsoleInput.getInt();
	            
	            switch(choice) {
	            case 1 :
	            	addEmployeeMenu();
	            	break;
	            	
	            case 2 :
	            	display();
	            	break;
	            case 3 :
	            	sortMenu();
	            	break;
	            case 6 : 
	            	System.out.println("Thank You ");
	            	break;
	           default :
	        	   System.out.println("Invalid Input ");
	       }
	            
	            
		}while(choice != 6 );
		
		
		
		
		
	}
	
	
	static void addEmployeeMenu() {
		int choice;
		
		do {
			 System.out.println("\n---------- ADD EMPLOYEE ----------");
	            System.out.println("1. Manager");
	            System.out.println("2. Engineer");
	            System.out.println("3. Sales Person");
	            System.out.println("4. Exit to Main Menu");

	            System.out.print("Enter choice : ");
	            choice = ConsoleInput.getInt();
	            
	            switch (choice){
	            	
	            	case 1 : 
	            		addManager();
	            		break;
	            	case 2 :
	            		addEngineer();
	            		break;
	            	case 3 :
	            		addSalesPerson();
	            		break;
	            	case 4 :
	            		System.out.println("Returning to main menu ");
	            		break;
	            	default :
	            		System.out.println("Invalid");
	            	
	            	
	            }
		}while(choice != 4);
	}
	
	static void addManager() {
		System.out.println("Name : ");
		String name = ConsoleInput.getString();
		
		System.out.print("Address : ");
        String address = ConsoleInput.getString();

        System.out.print("Age : ");
        int age = ConsoleInput.getInt();

        System.out.print("Gender : ");
        String gender = ConsoleInput.getString();

        System.out.print("Basic Salary : ");
        double basicSalary = ConsoleInput.getDouble();
        System.out.print("HRA : ");
        double hra = ConsoleInput.getDouble();

        employees[count] = new Manager(name, address, age, gender, basicSalary, hra);

        count++;

        System.out.println("Manager added successfully!");
	}
	
	static void addEngineer() {
		
		System.out.println("Name : ");
		String name = ConsoleInput.getString();
		
		System.out.print("Address : ");
        String address = ConsoleInput.getString();

        System.out.print("Age : ");
        int age = ConsoleInput.getInt();

        System.out.print("Gender : ");
        String gender = ConsoleInput.getString();

        System.out.print("Basic Salary : ");
        double basicSalary = ConsoleInput.getDouble();
        
        System.out.println("Overtime : ");
        double overtime = ConsoleInput.getDouble();
        
        employees[count] = new Engineer(name , address, age , gender,basicSalary , overtime);
        
        count++;
        System.out.println("Engineer added successfully ");
	}
	
	static void addSalesPerson() {
		System.out.println("Name : ");
		String name = ConsoleInput.getString();
		
		System.out.print("Address : ");
        String address = ConsoleInput.getString();

        System.out.print("Age : ");
        int age = ConsoleInput.getInt();

        System.out.print("Gender : ");
        String gender = ConsoleInput.getString();

        System.out.print("Basic Salary : ");
        double basicSalary = ConsoleInput.getDouble();
        
        System.out.println("Commission :");
        double commission = ConsoleInput.getDouble();
        
       employees[count] = new SalesPerson(name , address , age , gender , basicSalary , commission);
       
       count++;
       System.out.println("Sales person added successfully");
	}
	
	
	static void display() {

	    if (count == 0) {
	        System.out.println("No employees available!");
	        return;
	    }

	    System.out.println("\n========== ALL EMPLOYEES ==========");

	    for (int item = 0; item < count; item++) {

	        System.out.println("\nEmployee " + (item + 1));
	        employees[item].display();

	        System.out.println("--------------------------------");
	    }
	}
	
	static void sortMenu() {

	    char choice;

	    do {

	        System.out.println("\n---------- SORT ----------");
	        System.out.println("a. By Name Ascending");
	        System.out.println("b. By Name Descending");
	        System.out.println("c. By Designation");
	        System.out.println("d. Exit to Main Menu");

	        System.out.print("Enter choice : ");
	        choice = ConsoleInput.getChar();

	        switch (choice) {

	            case 'a':
	                sortByNameAscending();
	                break;

	            case 'b':
	                sortByNameDescending();
	                break;

	            case 'c':
	                sortByDesignation();
	                break;

	            case 'd':
	                System.out.println("Returning to Main Menu...");
	                break;

	            default:
	                System.out.println("Invalid choice!");

	        }

	    } while (choice != 'd');
	}
	
	static void sortByNameAscending() {

	    for (int i = 0; i < count - 1; i++) {

	        for (int j = i + 1; j < count; j++) {

	            if (employees[i].getName()
	                    .compareToIgnoreCase(employees[j].getName()) > 0) {

	                Employee temp = employees[i];
	                employees[i] = employees[j];
	                employees[j] = temp;
	            }
	        }
	    }

	    System.out.println("Employees sorted by Name - Ascending");
	    display();
	}
	
	static void sortByNameDescending() {

	    for (int i = 0; i < count - 1; i++) {

	        for (int j = i + 1; j < count; j++) {

	            if (employees[i].getName()
	                    .compareToIgnoreCase(employees[j].getName()) < 0) {

	                Employee temp = employees[i];
	                employees[i] = employees[j];
	                employees[j] = temp;
	            }
	        }
	    }

	    System.out.println("Employees sorted by Name - Descending");
	    display();
	}
	
	static void sortByDesignation() {

	    for (int i = 0; i < count - 1; i++) {

	        for (int j = i + 1; j < count; j++) {

	            if (employees[i].getDesignation()
	                    .compareToIgnoreCase(employees[j].getDesignation()) > 0) {

	                Employee temp = employees[i];
	                employees[i] = employees[j];
	                employees[j] = temp;
	            }
	        }
	    }

	    System.out.println("Employees sorted by Designation");
	    display();
	}
	
	

}
