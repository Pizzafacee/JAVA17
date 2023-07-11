package chapter13;

public class Kids extends ManKind {
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    public Kids() {
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    @Override
    public void employed() {
        System.out.println("kid should study and no job");
    }
}
