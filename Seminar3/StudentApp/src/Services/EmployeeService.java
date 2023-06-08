package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.PersonComparator;

public class EmployeeService implements iPersonService{
    private int count;
    private List<Employee> employees;
    public EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }
    public List<Employee> getSortedByFIOEmployeesList(){
        List<Employee> newEmpList = new ArrayList<Employee> (employees);
        newEmpList.sort(new PersonComparator<Employee>());
        return newEmpList;
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Employee per = new Employee(firstName, secondName, age, "basic");
        employees.add(per);
    }
    @Override
    public List getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
