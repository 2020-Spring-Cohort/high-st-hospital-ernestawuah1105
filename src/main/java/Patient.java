public class Patient {
    public int bloodLevel = 20;

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void bloodDrawn(int amountToDraw) {
        this.bloodLevel -= amountToDraw;
    }

    public int getHEALTH_LEVEL() {
        return HEALTH_LEVEL;
    }

    public void setHEALTH_LEVEL(int HEALTH_LEVEL) {
        this.HEALTH_LEVEL = HEALTH_LEVEL;
    }

    public int HEALTH_LEVEL =10;

}
