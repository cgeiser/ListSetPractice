package listsetpractice;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("s1", "Bill Smith", 39);
        Employee e2 = new Employee("f1", "Sally Fields", 25);
        Employee e3 = new Employee("s2", "Bill Smith", 30);
        
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for (Employee e : employees) {
            System.out.println("NAME: " + e.getName() +
                    "   AGE: " + e.getAge() +
                    "   ID#: " + e.getId());
        }
        
    }
}
