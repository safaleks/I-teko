package SecondLesson;

public class Task2 {
        public static void main(String[] args) {
            int n = 100; // Можно задать любое значение n
            System.out.println("Количество чисел: " + countValidNumbers(n));
        }

        public static int countValidNumbers(int n) {
            if (n < 1) return 0;

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    count++;
                }
            }
            return count;
        }

}
