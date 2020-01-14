package inheritance.second;

public class Banker extends Employee {

    private double bonus;

    public Banker(String fullName, double salary, double bonus) {
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
        return "Banker{" +
                "fullname=" + super.getFullName() +
                "bonus=" + bonus +
                '}';
    }


}
