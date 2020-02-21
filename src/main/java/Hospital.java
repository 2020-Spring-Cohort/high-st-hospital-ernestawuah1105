import java.util.HashMap;

public class Hospital {
    private HashMap<Integer, Employee> employeeCheckList = new HashMap<>();

    public HashMap<Integer, Employee> getEmployeeCheckList(){return employeeCheckList; }

    public void addEmployeeToCheckList(Employee testEmployee) {employeeCheckList.put(testEmployee.getEmployeeNumber(), testEmployee);}

    public int size() {
        return employeeCheckList.size();
    }

    public void payEmployees(){
        for (Employee employeeToBePaid : employeeCheckList.values()){
            employeeToBePaid.receivePay();
        }
        System.out.println("High Street Hospital staff have worked hard. Now it's payday!");
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "employeeList=" + employeeCheckList +
                '}';
    }
}
}
