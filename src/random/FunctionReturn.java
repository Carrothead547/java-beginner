package random;

public class FunctionReturn {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int total = thisFunctionReturns(num1, num2);

        System.out.println(thisFunctionReturns(5,1));
    }

    private static int thisFunctionReturns(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
