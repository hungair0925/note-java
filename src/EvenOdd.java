import java.util.Scanner;

public class EvenOdd {
    private static String judge(int number) {
        // if (number % 2 == 0) {
        // return "偶数";
        // }
        // return "奇数";
        return (number % 2 == 0) ? "偶数" : "奇数";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("整数を入力してください: ");
            int number = scanner.nextInt();
            String result = judge(number);
            System.out.printf("%dは「%s」%n", number, result);

            System.out.print("中断しますか?[yes/no]: ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }

}
