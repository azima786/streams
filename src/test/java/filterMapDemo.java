import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



    class Employee{
        int employeeId;

        public Employee(int employeeId, String name, int salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.salary = salary;
        }

        String name;
        int salary;



    }

    public class filterMapDemo {
    public static void main(String[] args) {
List<Employee> employeeList = Arrays.asList(
        new Employee(101, "Alex", 10000),
        new Employee(102, "David", 10500),
        new Employee(103, "Sam", 40500),
        new Employee(104, "Harry", 30500),
        new Employee(105, "Florida", 20000)

);

//Print salary of employees >20000 and after that salary of all employees
        employeeList.stream()
                .filter(s->s.salary>20000)
                .map(s-> s.salary).forEach(s-> System.out.println(s));


//employeeList.add(new Employee(101, "Alex", 10000));


    }
}
