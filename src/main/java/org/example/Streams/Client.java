package org.example.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000),
                new Employee(3, "Charlie", "Finance", 70000),
                new Employee(4, "David", "IT", 80000),
                new Employee(5, "Eve", "HR", 90000),
                new Employee(6, "Frank", "Finance", 30000),
                new Employee(7, "Grace", "IT", 40000),
                new Employee(8, "Hannah", "HR", 20000),
                new Employee(9, "Ian", "Finance", 100000),
                new Employee(10, "Jack", "IT", 55000)
        );

        List<Employee> Salary=employees.stream().filter(emp -> emp.salary > 50000).toList();
        System.out.println("Employees with salary greater than 50000:");
        System.out.println(Salary);


        List<Employee> HRDepart=employees.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("HR")).toList();
        System.out.println(HRDepart);

        Map<String, Long> deptCounts = employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment(),         // group by department name
                        Collectors.counting()
                        // count how many in each group
                ));
        System.out.println("Department counts:");
        deptCounts.forEach((dept, count) -> System.out.println(dept + ": " + count));


        List<String> TechDepartment=employees.stream().filter(emp -> emp.getDepartment().
                        equalsIgnoreCase("IT")).
                map(employee -> employee.getName()).toList();

        System.out.println(TechDepartment);

        List<String> EmplyeesLEsssalary=employees.stream().filter(emp->emp.getSalary() ==30000).map(emp->emp.getName()).toList();
        System.out.println("Employees with salary less than 30000:");
        System.out.println(EmplyeesLEsssalary);


        List<String> uniqueDeaprtment=employees.stream().map(emp->emp.getDepartment()).
                distinct().toList();
        System.out.println("Unique Departments:");
        System.out.println(uniqueDeaprtment);


        List<String> sortedEmployeeByName=employees.stream().map(emp -> emp.getName())
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("Employees sorted by name:");
        System.out.println(sortedEmployeeByName);


        List<Double> sortedEmployeeBySalary=employees.stream().map(emp -> emp.getSalary())
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("Employees sorted by name:");
        System.out.println(sortedEmployeeBySalary);

        List<Double> topThreeEmployeeBySalary=employees.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder())
                .limit(3).toList();
        System.out.println("Top three employees by salary:");
        System.out.println(topThreeEmployeeBySalary);


        List<String> TopThreeEmployeeByName=employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3).map(emp->emp.getName()).toList();
        System.out.println("Top three employees by name:");
        System.out.println(TopThreeEmployeeByName);

        List<String> leastThreeEmployeeByName=employees.stream().sorted(Comparator.comparing(Employee::getName)).limit(2)
                .map(emp->emp.getName()).toList();
        System.out.println("Least three employees by name:");
        System.out.println(leastThreeEmployeeByName);

        List<Employee> secondhighespaid=employees.stream().
                sorted(Comparator.comparing(Employee::getSalary).
                        reversed()).limit(2).skip(1).toList();

        System.out.println("Second highest paid employee:");
        System.out.println(secondhighespaid);

//        Group all employees by department, and list the names of employees in each department.

        Map<String,List<String>> employeesByDepartment=employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())
        ));
        System.out.println("Employees grouped by department:");
        employeesByDepartment.forEach((department, empNames) -> {
            System.out.println(department + ": " + empNames);
        });

        Map<String,Double> NameandSalary=employees.stream().collect(Collectors.toMap(
                Employee::getName,
                Employee::getSalary
        ));
        System.out.println("Employee names and their salaries:");
        NameandSalary.forEach((name, salary) -> {
            System.out.println(name + ": " + salary);
        });

        










    }
}
