package random;

public class Main {

    static int globalVariable = 1;

    public static void main(String[] args) {
        // loopExample();
        /* whileLoopExample();
        System.out.println("--------------");
        doWhileLoopExample(); */
        // characterExample();
        int var = 345;
        arrayExample();
        nestedLoop();
        loopExample(var);
        Math.pow(2,3);

        int fdf = Integer.parseInt("1");
    }

    private static void showMessage(String message) {
        System.out.println(message);
    }

    private static void loopExample(int variable) {
        int a = 1;
        for (int i = 0; i < variable; ++i) {
            System.out.print((i + 1) + "\t"); //Escape character
            if (i == 60) {
                break;
            }
        }
    }

    private static void whileLoopExample() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;

        }
    }

    private static void doWhileLoopExample() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    private static void characterExample() {
        char c = 'c';
       /* String text = "asnsnsnsa";
        for(int i = 0;i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }*/

        String text1 = "Hello";
        String text2 = "Humans";
        System.out.println(text1 + " " + text2);
        int i = 1;
        System.out.println(String.format("This is %d of %s", i, text1));

    }

    private static void arrayExample() {
        int[] a1 = new int[3];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        int sum = 0;

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
            sum += a1[i];
        }

        // System.out.println(sum);

        int[] b1 = {1, 2, 3};

        for (int number : b1) {
            System.out.println(number);
        }
    }

    private static void nestedLoop() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
            }
        }

    }
}


/**
 * take input from user (char) y/n
 * loop
 * another input inside of loop intger
 */

class SecondClass {

    public void randomfunc() {
        System.out.println(Main.globalVariable);
    }
}
