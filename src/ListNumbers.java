public class ListNumbers {
    public static String listNums(int x) {
        String result = "";

        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(listNums(5));
    }
}