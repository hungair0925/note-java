import java.util.Scanner;
import java.util.Arrays;

public class ScoreManager {
    public static int sum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static float average(int[] scores) {
        int sum = sum(scores);
        return (float) sum / (scores.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("スペース区切りでスコア(数値)を入力してください: ");
        String inputScoreLine = scanner.nextLine();
        String[] scoreStringList = inputScoreLine.split(" ");
        int[] scores = Arrays.stream(scoreStringList).mapToInt(Integer::parseInt).toArray();

        int sum = sum(scores);
        float average = average(scores);

        System.out.printf("合計値: %d %n", sum);
        System.out.printf("平均値: %.2f %n", average);

        scanner.close();
    }
}
