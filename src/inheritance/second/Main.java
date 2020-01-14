package inheritance.second;

public class Main {

    public static void main(String[] args) {

        Banker banker = new Banker("Ttt", 5000.0, 3000.0);
        Accountant accountant = new Accountant("Sdjkdkjd", 3000.0, 1000.0);


        // System.out.println(banker.getFullName() + " " + banker.getBonus());

        // System.out.println(accountant.getFullName() + " " + accountant.getBonus());

        System.out.println(banker);
        System.out.println(accountant);
    }
}
