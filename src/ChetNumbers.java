public class ChetNumbers {

    public static String chet(int x) {

        String result = "";

        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        System.out.println("Пример:");
        System.out.println("x=15");
        System.out.println("Результат: \"" + chet(15) + "\"");
    }
}
