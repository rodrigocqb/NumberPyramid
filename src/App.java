public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String pyramid = String.valueOf(i).repeat(i);
            System.out.println(pyramid);
        }
    }
}
