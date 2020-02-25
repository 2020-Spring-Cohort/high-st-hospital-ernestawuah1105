import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class DoctorTest {
    @Test
    public void doctorHasASpecialty(){
        Doctor underTest = new Doctor("testName",1, 947, "cardiology");
        String result = underTest.getSpecialty();
        assertEquals("cardiology", result);
    }
    @Test
    public void doctorHasAPayrate(){
        Doctor underTest = new Doctor("testName",1, 826, "cardiology");
        int result = underTest.paySalary();
        assertEquals(90000, result);
    }
    @Test
    public void doctorCanDrawBlood(){
        Doctor underTest = new Doctor("testName",1, 972, "cardiology");
        Patient testPatient = new Patient("testPatient", 1);
        underTest.drawBlood(testPatient);
        int result = testPatient.getBloodLevel();
        assertEquals(16, result);
    }
    @Test
    public void doctorCanProvideCare(){
        Doctor underTest = new Doctor("testName",1, 728, "cardiology");
        Patient testPatient = new Patient("testPatient", 1);
        underTest.careForPatient(testPatient);
        int result = testPatient.getHealthLevel();
        assertEquals(21, result);
    }
}