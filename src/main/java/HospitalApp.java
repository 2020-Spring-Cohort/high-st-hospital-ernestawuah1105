import java.util.Scanner;

public class HospitalApp {

   public static void main (String[] args) {
       Hospital highStreetHospital = new Hospital();
       Doctor doc1 = new Doctor("Sam", 123, "Heart");
       Doctor doc2 = new Doctor("Ben" , 234,"family");
       Nurse nurse = new Nurse("Dora", 2222);

       Receptionist recep = new Receptionist("Tom", 5125);
       Janitor janitor = new Janitor();
       highStreetHospital.addEmployeeToCheckList(doc1);
       highStreetHospital.addEmployeeToCheckList(doc2);
       highStreetHospital.addEmployeeToCheckList(nurse);
       highStreetHospital.addEmployeeToCheckList(recep);
       highStreetHospital.addEmployeeToCheckList(janitor);

       public static void printEmployeeCheckList(Hospital highStreetHospital) {
           for(int IDNumber : highStreetHospital.getEmployeeCheckList().keySet()) {
               Employee someEmployeeFromTheList = highStreetHospital.getEmployeeCheckList().get(IDNumber);
               System.out.println(someEmployeeFromTheList);

           }
       }






            }

        }


