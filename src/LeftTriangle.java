public class LeftTriangle {

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Пример 1:");
        System.out.println("x=1");
        leftTriangle(1);

        System.out.println("\nПример 2:");
        System.out.println("x=5");
        leftTriangle(5);
    }
}
