public class one{
    public static void main(String[] args) {
        int x = 21;

        System.out.print("Sequence: " + x);

        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x * 3 + 1;
            }
            System.out.print(" = " + x);
        }
    }
}