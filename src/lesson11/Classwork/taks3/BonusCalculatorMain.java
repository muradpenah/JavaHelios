package lesson11.Classwork.taks3;

import java.util.ArrayList;
import java.util.List;

public class BonusCalculatorMain {
    public class BonusCalculator{
        public static double calculateBonus(List<? extends Employee> employees){
            double cem = 0;
            for (Employee maash : employees){
                cem+=maash.getMaash()*0.1;
            }
            return cem;
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Engineer(1000,"Zakir"));
        employees.add(new Manager(3500,"Nail"));
        employees.add(new Intern(350,"Nicat"));
        System.out.println(BonusCalculator.calculateBonus(employees));
    }
}
