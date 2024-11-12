import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("長さを入力してください[m]: ");
        double meter = scanner.nextDouble();

        double centiMeter = meter * Math.pow(10, 2);
        double kiloMeter = meter / Math.pow(10, 3);

        System.out.printf("%.2f[m] -> %.2f[cm]%n", meter, centiMeter);
        System.out.printf("%.2f[m] -> %.3f[km]%n", meter, kiloMeter);

        scanner.close();
    }
}
