package lesson20_Lambda.TaskEmployee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> allEmployees = Arrays.asList(
                new Employee("Əli Quliyev", 25, "Satış"),
                new Employee("Aynur Həsənova", 19, "Maliyyə"),
                new Employee("Tural Məmmədov", 32, "İT"),
                new Employee("Günel Kərimova", 20, "HR"),
                new Employee("Fərid Vəliyev", 40, "İdarəetmə")
        );
        EmployeeHandler employeeHandler = new EmployeeHandler();
        Predicate<Employee> employeePredicate = (a)-> a.getAge()>20;
        Consumer<Employee> employeeConsumer =(a)-> System.out.printf(" Seçilmiş İşçi: Ad: %s, Yaş: %d, Şöbə: %s\n",
                a.getName(), a.getAge(), a.getDepartment());
        employeeHandler.processEmployees(allEmployees,employeePredicate,employeeConsumer);
    }
}
