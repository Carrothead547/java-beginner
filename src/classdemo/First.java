package classdemo;

public class First {

    public static void main(String[] args) {

        Person sukant = new Person();
        sukant.setFirstName("Sukant");
        sukant.setLastName("Rajkarnikar");
        sukant.setAge(20);

        System.out.println(sukant.getFirstName() + "\t" + sukant.getLastName());

        Person sujin = new Person("Sujin", "Shrestha", 22);

        System.out.println(sujin.getFirstName() + " " + sujin.getLastName());


    }
}


class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person() {

    }

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void setFirstName(String fname) {
        this.firstName = fname;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}


