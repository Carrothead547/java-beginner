package random;

public class Example {

    public static void main(String[] args) {
        int s = sum(4, 5, 6);
        System.out.println(s);
        int x = 4;
        int y = 5;
        int z = 6;
        int q = sum(x, y, z);
        System.out.println(q);
        float u=sum(3.0f, 5.0f);
        System.out.println(u);
    }

    private static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    private static float sum(float a,float b){
        float sum= a +b;
        return sum;
    }

    public static void publicMethod() {
        System.out.println("Public");
    }
}

