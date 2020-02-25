public class Patient {
    private String name;
    private int patientID;
    private int bloodLevel;
    private int healthLevel;

    public Patient(String name, int patientID) {
        this.name = name;
        this.patientID = patientID;
        this.bloodLevel = 20;
        this.healthLevel = 15;

    }

    public String getName() {
        return name;
    }

    public int getPatientID() {
        return patientID;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void giveBloodToNurse() {
        bloodLevel -= 3;
    }

    public void receiveCareFromNurse() {
        healthLevel += 2;
    }

    public void giveBloodToDoctor() {
        bloodLevel -= 4;
    }

    public void receiveCareFromDoctor() {
        healthLevel += 6;
    }

    @Override
    public String toString() {
        return "name= " + name
                + ", patient ID= " + patientID
                + ", bloodLevel= " + bloodLevel +
                ", healthLevel= " + healthLevel;
    }
}