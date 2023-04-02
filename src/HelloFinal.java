public class HelloFinal {
    public static void main(String[]args) {
        final float TAX_RATE = 0.1F;
        int itemPrice = 100;

        float price = itemPrice * (1 + TAX_RATE);
        System.out.println("Price: " + price);
    }
}
