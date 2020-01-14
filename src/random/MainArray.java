package random;

import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1};
        int sum = 0;
        double avg;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        avg = (double) (sum / array.length);

        System.out.println(String.format("The sum is %d", sum));
        System.out.println("The average is: " + avg);

        System.out.println("Enter number");
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();

        for (int i=0; i<array.length; i++){
            if(a == array[i]){
                System.out.println("the position is"+ i);
                 break;
            }
        }

    }
}
