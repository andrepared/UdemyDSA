import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String args[])
    {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", "123"));
        employeeList.add(new Employee("Rob", "Shnieder", "456"));
        employeeList.add(new Employee("Mary", "Smith", "176"));
        employeeList.add(new Employee("Joe", "Dill", "221"));

//        employeeList.forEach(employee -> System.out.println(employee));

//        System.out.println(employeeList.size());

        employeeList.add(0, new Employee("Joe", "Dill", "221"));
//        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for(Employee employee:employeeArray){
//            System.out.println(employee);
//        }
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", "176")));
        System.out.println(employeeList.indexOf(new Employee("Jane", "Jones", "123")));

        employeeList.remove(2);

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
