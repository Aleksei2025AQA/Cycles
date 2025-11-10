public class NumberLength {

    public static int numLen(long x) {
        if (x == 0) {
            return 1;
        }

        int count = 0;

        while (x != 0) {
            x = x / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Пример:");
        System.out.println("x=9321457");
        System.out.println("Результат: " + numLen(9321457));
    }
}
