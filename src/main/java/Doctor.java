
public class Doctor extends Employee {

    String speciality;

    public Doctor (String name, int id, String speciality){
        super(name, id, 90000);
        this.speciality = speciality;

    }

//    public  void paySalary() {
//        if (paid){
//            return;
//            else {
//                paid=true
//            }
//        }
//    }

    public void drawBlood(Patient patient) {

        patient.bloodDrawn(5);

    }
}

