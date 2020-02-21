import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
   import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class HospitalTest {
    private Hospital underTest;
    private Employee testEmployee;

    @BeforeEach
    void setUp(){
        underTest = new Hospital();
        testEmployee = new Employee("testEmployee", 0, false);
    }
    @Test
    public void canAddEmployeeToList() {
        underTest.addEmployeeToCheckList();List(testEmployee);
        assertEquals(1, underTest.size());
    }

    @Test
    public void canPayEmployees(){
        underTest.addEmployeeToCheckList(testEmployee);
        underTest.payEmployees();
        assertTrue(testEmployee.getIsPaid());
    }
}