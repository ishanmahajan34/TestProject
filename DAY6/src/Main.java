import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahajani on 7/25/2017.
 */
public class Main {

    public static void main(String[] args) {

//        Employee employee1 = new Employee(14,"Ishan Mahajan", 4500000,"8390703981", "Software Developer");
//        HRServices.setCredits(employee1.getEmployeeId());
//        System.out.println(SalaryServices.updateSalary(employee1.getEmployeeId(),employee1.getSalary()));

        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        List<Employee> employeeList = employeeDatabase.creeateEmployeeDatabse();

        for(int i = 0 ; i < employeeList.size() ; i++ ) {
            HRServices.setCredits(employeeList.get(i).getEmployeeId());
//            System.out.println(SalaryServices.updateSalary(employee1.getEmployeeId(),employee1.getSalary()));

            //////HERE I WANT TO GET RID OF SALARY PARAMETER FROM UPDATESALARY FUNCTION!!!!!
        }

    }

}
