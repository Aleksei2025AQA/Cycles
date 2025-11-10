public class Square {

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Пример 1:");
        System.out.println("x=3");
        square(3);

        System.out.println("\nПример 2:");
        System.out.println("x=5");
        square(5);
    }
}
