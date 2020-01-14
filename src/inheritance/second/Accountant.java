package inheritance.second;

public class Accountant extends Employee {

    private double bonus;

    public Accountant(String fullName, double salary, double bonus) {
        super(fullName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getFullName() + ":::::" + this.bonus;
    }
}
