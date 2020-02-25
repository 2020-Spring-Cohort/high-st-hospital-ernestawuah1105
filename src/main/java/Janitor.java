public class Janitor extends Employee{
    private boolean isSweeping;
    public Janitor(String name, int IDNumber, int payRate, boolean isSweeping){
        super(name, IDNumber, payRate);
        this.isSweeping = isSweeping;
    }
    public boolean getIsSweeping(){
        return isSweeping;
    }

    public void Sweep(){
        isSweeping = true;
    }

    @Override
    public int paySalary() {
        return 40000;
    }

    @Override
    public String toString() {
        return "Position= janitor, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", isSweeping= " + isSweeping
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }
}







