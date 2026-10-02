import java.util.ArrayList;
import java.util.Scanner;

public class StudentQueueMenu {

    private StudentQueue studentQueue;
    private Scanner sc;

    StudentQueueMenu() {
        studentQueue = new StudentQueue();
        sc = new Scanner(System.in);
    }

    public void showMenu() {

        int choice;

        do {
            System.out.println("\n===== Student Queue Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Submit Assignment");
            System.out.println("3. Search Student");
            System.out.println("4. Display Queue");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    studentQueue.addStudent(id);
                    break;

                case 2:
                    studentQueue.submitAssignment();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    studentQueue.searchStudent(searchId);
                    break;

                case 4:
                    studentQueue.displayQueue();
                    break;

                case 5:
                    studentQueue.countStudents();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }

    public static void main(String[] args) {
        StudentQueueMenu menu = new StudentQueueMenu();
        menu.showMenu();
    }
}

class StudentQueue {

    private ArrayList<Integer> queue = new ArrayList<>();

    public void addStudent(int studentId) {

        queue.add(studentId);

        System.out.println(
                "Student " + studentId + " added to the queue.");
    }

    public void submitAssignment() {

        if (queue.isEmpty()) {

            System.out.println(
                    "Queue is empty, no student in the queue.");

        } else {

            int studentId = queue.remove(0);

            System.out.println(
                    "Student " + studentId +
                            " submitted the assignment.");
        }
    }

    public void searchStudent(int studentId) {

        if (queue.contains(studentId)) {

            System.out.println(
                    "Student " + studentId + " is waiting.");

        } else {

            System.out.println(
                    "Student " + studentId + " is not waiting.");
        }
    }

    public void displayQueue() {

        if (queue.isEmpty()) {

            System.out.println("Queue is empty.");

        } else {

            System.out.println("Queue: " + queue);
        }
    }

    public void countStudents() {

        System.out.println(
                "Count of Students in queue: " + queue.size());
    }
}
