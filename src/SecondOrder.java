import java.util.Scanner;
public class SecondOrder {
    public static void main(String[] args) {
        int countPlanet = 9;
        int pluto = 1;
        int result = countPlanet-pluto;
        System.out.println(countPlanet + " - " + pluto + " = " + result);
        System.out.println(Long.MAX_VALUE);
        System.out.println(false);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a, b));
    }
}
