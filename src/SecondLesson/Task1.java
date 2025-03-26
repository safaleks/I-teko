package SecondLesson;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int pow;
        if (count % 2 == 1){
            pow = (int) Math.pow(count , 3);
        }
        else {
            pow = (int) Math.pow(count , 10);
        }
        System.out.println(pow);
    }
}
