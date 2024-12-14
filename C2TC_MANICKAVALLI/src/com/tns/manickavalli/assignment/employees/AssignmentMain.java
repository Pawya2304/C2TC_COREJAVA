import com.tns.manickavalli.assignment.employees.Manager;
import com.tns.manickavalli.assignment.employees.Developer;
import com.tns.manickavalli.assignment.employees.EmployeeUtilities;

/**
 * The AssignmentMain class demonstrates the usage of the Employee, Manager, Developer,
 * and EmployeeUtilities classes.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Creating instances of Manager and Developer
        Manager manager = new Manager("John Doe", 101, 80000, "HR");
        Developer developer = new Developer("Jane Smith", 102, 60000, "Java");

        // Creating an instance of EmployeeUtilities
        EmployeeUtilities utilities = new EmployeeUtilities();

        // Using utility methods to perform operations
        utilities.printEmployeeDetails(manager);
        utilities.printEmployeeDetails(developer);

        // Giving salary raise to Developer
        utilities.giveSalaryRaiseToDeveloper(developer, 5000);

        // Assigning Manager to a new department
        utilities.assignManagerToNewDepartment(manager, "Finance");
    }
}
