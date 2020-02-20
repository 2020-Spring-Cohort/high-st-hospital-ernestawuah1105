import java.util.HashMap;

public class Hospital {
    private HashMap<Integer, Employee> employeeCheckList = new HashMap<>();

    public HashMap<Integer, Employee> getEmployeeCheckList(){return employeeCheckList; }

    public void addEmployeeToCheckList(Employee testEmployee) {employeeCheckList.put(testEmployee.getEmployeeNumber(), testEmployee);}


}
