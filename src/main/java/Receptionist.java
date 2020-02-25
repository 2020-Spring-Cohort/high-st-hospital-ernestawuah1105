public class Receptionist extends Employee {
    private boolean onPhone;

    public Receptionist(String name, int IDNumber, int payRate, boolean onPhone){
        super(name, IDNumber, payRate);
        this.onPhone = onPhone;
    }

    public boolean getOnPhone(){
        return onPhone;
    }

    public void answerPhone(){onPhone = true;}

    @Override
    public int paySalary() {
        return 45000;
    }

    @Override
    public String toString() {
        return "Position= receptionist, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", on phone= " + onPhone
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }
}

