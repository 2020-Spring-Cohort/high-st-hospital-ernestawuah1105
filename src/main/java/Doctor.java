
public class Doctor extends Employee {

    String speciality;

    public Doctor(String name, int id, String speciality) {
        super(name, id, 90000);
        this.speciality = speciality;

    }
    public String getSpeciality() {return speciality}

    public int paySalary() {return 90000}

    @Override
    public String toString() {
        return "Position= doctor"
    }





    public void drawBlood(Patient testPateint) {
        testPateint.giveBloodToDoctor();
    }


    public void careForPatient(Patient testPateint) {
        testPateint.receiveCareFromDoctor();
    }

}