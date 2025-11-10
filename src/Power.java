public class Power {
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Пример1:");
        System.out.println("x=3 y=7");
        System.out.println("Результат: " + pow(3, 7));
        System.out.println("Пример2:");
        System.out.println("x=4 y=0");
        System.out.println("Результат: " + pow(4, 0));
    }
}
