import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmployeeTest {

    @Test
    public void employeeHasAName(){
        Employee underTest = new Employee("testName", 1,  124);
        String result = underTest.getName();
        assertEquals("testName", result);
    }
    @Test
    public void employeeHasAnIDNumber(){
        Employee underTest = new Employee("testName", 1, 356);
        int result = underTest.getIDNumber();
        assertEquals(1, result);
    }
    @Test
    public void employeeReceivesSalary(){
        Employee underTest = new Employee("testName", 1, 567);
        int result = underTest.paySalary();
        assertEquals(0, result);
    }
}