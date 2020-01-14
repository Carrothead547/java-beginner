package random;

public class functionssfa {

    public static void main(String[] args) {
/*        System.out.println("Before function");
        printName();
        System.out.println("After function call");
        int number = returnone();
        System.out.println(number);

        displayNumber(number);
        add(10, 12);
        System.out.println(add(1.0, 2.5));*/

        int a = 1;

        System.out.println("Integer a:\t" + a);
        System.out.println("Float a:\t" + (float) a);
        System.out.println("Double a:\t" + (double) a);

    }

    public static void printName() {
        System.out.println("Sujin");
    }

    private static int returnone() {
        return 1;
    }

    private static void displayNumber(int param1) {
        System.out.println("Inside function" + param1);
    }

    private static int add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }

    private static float add(double num1, double num2) {
        return (float) (num1 + num2);
    }
}
