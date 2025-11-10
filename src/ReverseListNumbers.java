public class ReverseListNumbers {

    public static String reverseListNums(int x) {

        String result = "";

        for (int i = x; i >= 0; i--) {
            result += i + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        System.out.println("Пример:");
        System.out.println("x=10");
        System.out.println("Результат: \"" + reverseListNums(10) + "\"");

    }
}
