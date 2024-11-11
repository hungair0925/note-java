import java.util.Scanner;

public class BmiCalculator {
    public static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBmiCategory(double bmi) {
        if (bmi >= 30.0) {
            return "肥満(2度以上)";
        }
        if (bmi >= 25.0) {
            return "肥満(1度)";
        }
        if (bmi >= 18.5) {
            return "標準";
        }

        return "痩せ";
    }

    public static void main(String[] args) {
        // 入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("身長を入力してください[cm]: ");
        double height = scanner.nextDouble() / 100;
        System.out.print("体重を入力してください[kg]: ");
        double weight = scanner.nextDouble();
        // 演算
        double bmi = calculateBmi(weight, height);
        String bmiCategory = getBmiCategory(bmi);
        // 出力
        System.out.printf("%-20s%n", "=".repeat(20));
        System.out.printf("%-7s %.2f%n", "[BMI]", bmi);
        System.out.printf("%-5s %s%n", "[分類]", bmiCategory);
        System.out.printf("%-20s%n", "=".repeat(20));

        scanner.close();
    }

}
