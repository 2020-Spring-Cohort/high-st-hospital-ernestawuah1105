class HospitalApplication {
    public static void main(String[] args) {
        Hospital highStreetHospital = createHospital();

        Doctor doctor1 = hireDoctor(highStreetHospital);

        Nurse nurse1 = hireNurse(highStreetHospital);

        Receptionist receptionist1 = hireReceptionist(highStreetHospital);

        Janitor janitor1 = hireJanitor(highStreetHospital);

        reportHiring(highStreetHospital);

        Patient patient1 = new Patient("Dan",23);
        Patient patient2 = new Patient("Sandra",24);
        nurse1.addPatientToPatientsList(23, patient1);
        nurse1.addPatientToPatientsList(24, patient2);


        reportPatientsList(nurse1);

        nurseTreatsANGEL(nurse1, patient1);

        doctorTreatsDORA(doctor1, nurse1, patient2);

        janitorSweeps(highStreetHospital, janitor1);

        receptionistAnswersPhone(highStreetHospital, receptionist1);

        payDay(highStreetHospital);
    }

    private static void reportPatientsList(Nurse nurse1) {
        System.out.println("Nurse JOELLE is taking care of the patients below:");
        System.out.println("");
        printPatientsList(nurse1);
        System.out.println("");
        System.out.println("");
    }

    private static void reportHiring(Hospital highStreetHospital) {
        System.out.println("The hospital employed the following workers:");
        System.out.println("");
        printEmployeeStatuses(highStreetHospital);
    }

    private static void payDay(Hospital highStreetHospital) {
        highStreetHospital.payEmployees();
        printEmployeeStatuses(highStreetHospital);
    }

    private static void janitorSweeps(Hospital highStreetHospital, Janitor janitor1) {
        janitor1.Sweep();
        System.out.println("Parker is cleaning the floor.");
        System.out.println("");
        System.out.println(highStreetHospital.getEmployeeCheckList().get(4));
        System.out.println("");
        System.out.println("");
    }

    private static void receptionistAnswersPhone(Hospital highStreetHospital, Receptionist receptionist1) {
        receptionist1.answerPhone();
        System.out.println("Darlene answers the phone.");
        System.out.println("");
        System.out.println(highStreetHospital.getEmployeeCheckList().get(3));
        System.out.println("");
        System.out.println("");
    }

    private static void doctorTreatsDORA(Doctor doctor1, Nurse nurse1, Patient patient2) {
        doctor1.drawBlood(patient2);
        doctor1.careForPatient(patient2);
        System.out.println("Doctor Josiah drew blood Sandra.");
        System.out.println("");
        System.out.println(nurse1.getPatientsList().get(2));
        System.out.println("");
        System.out.println("");
    }

    private static void nurseTreatsANGEL(Nurse nurse1, Patient patient1) {
        nurse1.drawBlood(patient1);
        nurse1.careForPatient(patient1);
        System.out.println("Nurse JOELLE drew blood from the patient.");
        System.out.println("");
        System.out.println(nurse1.getPatientsList().get(1));
        System.out.println("");
        System.out.println("");
    }

    private static void printPatientsList(Nurse nurse1) {
        for(int patientID : nurse1.getPatientsList().keySet()) {
            Patient somePatientFromList = nurse1.getPatientsList().get(patientID);
            System.out.println(somePatientFromList);
        }
    }






    private static Janitor hireJanitor(Hospital highStreetHospital) {
        Janitor janitor1 = new Janitor("Parker", 4, 789, false);
        highStreetHospital.addEmployeeToCheckList(janitor1);
        return janitor1;
    }

    private static Receptionist hireReceptionist(Hospital highStreetHospital) {
        Receptionist receptionist1 = new Receptionist("Darlene", 3, 654, false);
        highStreetHospital.addEmployeeToCheckList(receptionist1);
        return receptionist1;
    }

    private static Nurse hireNurse(Hospital highStreetHospital) {
        Nurse nurse1 = new Nurse("JOELLE", 2, 378);
        highStreetHospital.addEmployeeToCheckList(nurse1);
        return nurse1;
    }

    private static Doctor hireDoctor(Hospital highStreetHospital) {
        Doctor doctor1 = new Doctor("JOSIAH", 1, 824, "OBGYN");
        highStreetHospital.addEmployeeToCheckList(doctor1);
        return doctor1;
    }

    private static Hospital createHospital() {
        return new Hospital();
    }

    private static void printEmployeeStatuses(Hospital highStreetHospital) {
        for(int IDNumber : highStreetHospital.getEmployeeCheckList().keySet()){
            Employee someEmployeeFromList = highStreetHospital.getEmployeeCheckList().get(IDNumber);
            System.out.println(someEmployeeFromList);
        }
        System.out.println("");
        System.out.println("");
    }
}

