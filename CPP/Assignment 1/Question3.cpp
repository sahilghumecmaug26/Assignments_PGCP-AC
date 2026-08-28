#include <iostream>

#include <iomanip>

using namespace std;

class Employee
{
private:
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;

public:

    // Constructor
    Employee()
    {
        empId = 1001 + employeeCount;
        employeeCount++;

        name = "";
        department = "";
        grade = 'D';
        basicSalary = 0;
        isActive = true;
    }


    // Setter for name
    void setName(const string& n)
    {
        if (n.empty())
        {
            cout << "ERROR: Name cannot be empty." << endl;
        }
        else
        {
            name = n;
        }
    }


    // Setter for department
    void setDepartment(const string& dept)
    {
        if (dept == "Engineering" ||
            dept == "HR" ||
            dept == "Finance" ||
            dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << "ERROR: '" << dept << "' is not a registered department." << endl;
        }
    }


    // Setter for grade
    void setGrade(char g)
    {
        if (g == 'A' || g == 'B' || g == 'C' ||g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "ERROR: Invalid grade '" << g << "'. Accepted values: A, B, C, D."<< endl;
        }
    }


    // Setter for basic salary
    void setBasicSalary(double salary)
    {
        if (salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between Rs.10,000 "<< "and Rs.5,00,000. Value rejected."<< endl;
        }
    }


    // Deactivate employee
    void deactivate()
    {
        isActive = false;
    }


    // Getters
    int getEmpId() const
    {
        return empId;
    }

    string getName() const
    {
        return name;
    }

    string getDepartment() const
    {
        return department;
    }

    char getGrade() const
    {
        return grade;
    }

    double getBasicSalary() const
    {
        return basicSalary;
    }

    bool getIsActive() const
    {
        return isActive;
    }


    // Calculate allowances
    double computeAllowances() const
    {
        if (grade == 'A')
        {
            return basicSalary * 0.40;
        }
        else if (grade == 'B')
        {
            return basicSalary * 0.30;
        }
        else if (grade == 'C')
        {
            return basicSalary * 0.20;
        }
        else
        {
            return basicSalary * 0.10;
        }
    }


    // Calculate gross salary
    double computeGrossSalary() const
    {
        return basicSalary + computeAllowances();
    }


    // Calculate tax
    double computeTax() const
    {
        double gross = computeGrossSalary();

        if (gross <= 50000)
        {
            return 0;
        }
        else if (gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }


    // Calculate net salary
    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }


    // Accept employee details
    void acceptDetails()
    {
        string n;
        string dept;
        char g;
        double salary;

        cout << "Enter name: ";
        getline(cin >> ws, n);
        setName(n);

        cout << "Enter department: ";
        getline(cin >> ws, dept);
        setDepartment(dept);

        cout << "Enter grade: ";
        cin >> g;
        setGrade(g);

        cout << "Enter basic salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }


    // Print payslip
    void printPayslip() const
    {
        cout << endl;

        cout << "============================================" << endl;
        cout << "EMPLOYEE PAYSLIP - AUG 2026" << endl;
        cout << "============================================" << endl;

        cout << "Emp ID          : " << empId << endl;
        cout << "Name            : " << name << endl;
        cout << "Department      : " << department << endl;
        cout << "Grade           : " << grade << endl;

        cout << "Status          : ";

        if (isActive)
        {
            cout << "Active" << endl;
        }
        else
        {
            cout << "Inactive" << endl;
        }

        cout << "--------------------------------------------" << endl;

        cout << "Basic Salary    : Rs. "<< basicSalary << endl;

        cout << "Allowances      : Rs. "<< computeAllowances() << endl;

        cout << "Gross Salary    : Rs. "<< computeGrossSalary() << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Tax Deduction   : Rs. "<< computeTax() << endl;

        cout << "Net Salary      : Rs. "<< computeNetSalary() << endl;

        cout << "============================================" << endl;
    }


    // Static function
    static int getEmployeeCount()
    {
        return employeeCount;
    }
};


// Initialize static member
int Employee::employeeCount = 0;


int main()
{
    // One object on stack
    Employee e1;

    // Two objects on heap
    Employee* e2 = new Employee();
    Employee* e3 = new Employee();


    // Accept details
    e1.acceptDetails();
    e2->acceptDetails();
    e3->acceptDetails();


    /*
    The following statements produce compiler errors:

    e1.empId = 999;
    e1.basicSalary = -1000;

    empId and basicSalary are private members.
    Private members cannot be accessed directly from outside the class.
    They can only be accessed through public member functions.
    This provides encapsulation and prevents invalid data.
    */


    // Print payslips
    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();


    // Simulate resignation
    e3->deactivate();


    if (!e3->getIsActive())
    {
        cout << e3->getName()<< " is no longer active. Payroll skipped." << endl;
    }


    // Display total employees
    cout << "Total Employees : "<< Employee::getEmployeeCount() << endl;


    // Free heap memory
    delete e2;
    delete e3;


    return 0;
}
