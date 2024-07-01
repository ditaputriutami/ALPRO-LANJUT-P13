public class Lat2_13 {
    public static void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void reverseStringRecursive(String str) {
        if (str.length() == 1) {
            System.out.print(str);
            return;
        }
        reverseStringRecursive(str.substring(1));
        System.out.print(str.charAt(0));
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        reverseString(str);
        reverseStringRecursive(str);
    }
}