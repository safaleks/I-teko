package SecondLesson;

public class Test2 {
    public static void main(String[] args) {
        int count = 1;

        if (count < 5) {
            count = 5;
            if (count > 5) {
                count = 2;
            } else if (count > 4) {
                count = 3;
            }
        }

        System.out.println(count);
    }
}
