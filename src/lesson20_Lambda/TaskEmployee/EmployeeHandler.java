package lesson20_Lambda.TaskEmployee;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeHandler {
    public void processEmployees
            (List<Employee> employeeList, Predicate<Employee> filter , Consumer<Employee> action ){
        for (Employee employee : employeeList){
            if (filter.test(employee)) action.accept(employee);
        }
    }
}
