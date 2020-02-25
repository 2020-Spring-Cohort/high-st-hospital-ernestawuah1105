public class Employee {

    private String employeeName;
    private int employeeNumber;
    private double salary;
    private boolean paid;

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Employee(String name, int id, int payRate){
        this.employeeName = name;
        this.employeeNumber = id;
        this.salary = payRate;


    }


    public String getName() {
        return employeeName;
    }

    public int getIDNumber() {
        return employeeNumber;
    }

    public int paySalary() {
        return 0;


    }

    public boolean getIsPaid() {
        return paid;
    }

    public void receivePay() {
        paid = true;
    }
}
