package inheritance.first;

public class Main {

    public static void main(String[] args) {
        Child c1 = new Child("Asdf", "Ddf", 10);
        c1.getFirstName();
        c1.getAge();

        Parent p1 = new Parent("Asdf", "dfsdf");
        p1.getFirstName();
    }
}
