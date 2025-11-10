public class EqualDigits {

    public static boolean equalNum(int x) {
        if (x < 10) {
            return true;
        }

        int lastDigit = x % 10;

        while (x != 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x = x / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Пример 1:");
        System.out.println("x=1111");
        System.out.println("Результат: " + equalNum(1111));

        System.out.println("\nПример 2:");
        System.out.println("x=1211");
        System.out.println("Результат: " + equalNum(1211));

        System.out.println("\nПример 3:");
        System.out.println("x=0");
        System.out.println("Результат: " + equalNum(0));
    }
}
