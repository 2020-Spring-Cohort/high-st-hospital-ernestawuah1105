public class HospitalApp {

   public static void main (String[] args) {
       Doctor doc1 = new Doctor("Sam", 123, "Heart");
       Doctor doc2 = new Doctor("Ben" , 234,"family");
       Nurse nurse = new Nurse("Dora", 2222);
       Receptionist recep = new Receptionist("Tom", 5125);
       Janitor janitor = new Janitor("Sally", 554);
       Employee[] employeeList = new Employee[5];
       employeeList[0] = doc1;
       employeeList[1] = doc2;
       employeeList[2] = nurse;
       employeeList[3] = recep;
       employeeList[5] = janitor;

       printEmployeeList(employeeList);
//       payEmployees(employeesList);
   }


    public static void printEmployeeList(Employee [] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName());
//            employee. paySalary();
            }

        }
    }

