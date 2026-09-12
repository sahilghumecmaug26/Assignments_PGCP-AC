
public class Program {
	public static void main(String []args) {
		
	       Date objDate = new Date();

	        int choice;

	        do {
	            System.out.println("************* Menu Driven Program ****************");
	            System.out.println("1. Set Date");
	            System.out.println("2. Add Days");
	            System.out.println("3. Add Months");
	            System.out.println("4. Add Years");
	            System.out.println("5. Display Date");
	            System.out.println("6. Exit");

	            System.out.println("Enter your choice:");
	            choice = ConsoleInput.getInt();

	            switch (choice) {

	            case 1:
	                System.out.println("Enter the Day:");
	                int day = ConsoleInput.getInt();

	                System.out.println("Enter the Month:");
	                int month = ConsoleInput.getInt();

	                System.out.println("Enter the Year:");
	                int year = ConsoleInput.getInt();

	                objDate.setDate(day, month, year);
	                break;

	            case 2:
	                System.out.println("Enter number of Days:");
	                int days = ConsoleInput.getInt();

	                objDate.addDays(days);
	                break;

	            case 3:
	                System.out.println("Enter number of Months:");
	                int months = ConsoleInput.getInt();

	                objDate.addMonths(months);
	                break;

	            case 4:
	                System.out.println("Enter number of Years:");
	                int years = ConsoleInput.getInt();

	                objDate.addYears(years);
	                break;

	            case 5:
	                objDate.display();
	                break;

	            case 6:
	                System.out.println("Exit...");
	                break;

	            default:
	                System.out.println("Invalid Choice");
	                break;
	            }

	        } while (choice != 6);
	    }
	
}
