import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoctorTest {


    @Test
    public void doctorCanDrawBlood(){
        Doctor underTest = new Doctor("bill", 123, "brain");
        Patient testPatient = new Patient();
        underTest.drawBlood(testPatient);
        Assertions.assertEquals(15, testPatient.getBloodLevel());
    }

}
