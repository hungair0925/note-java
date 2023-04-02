public class HelloCast {
    public static void main(String[]args) {
        long largeNumber = 1234567890123456789L;
        int normalNumber = (int)largeNumber;

        float largeFloatNumber = 123.45f;
        int normalNumber2 = (int)largeFloatNumber;

        System.out.println("largeNumber=" + largeNumber);
        System.out.println("normalNumber=" + normalNumber);

        System.out.println("largeFloatNumber=" + largeFloatNumber);
        System.out.println("normalNumber2=" + normalNumber2);
    }
}
