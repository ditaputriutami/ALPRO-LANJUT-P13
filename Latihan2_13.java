public class Latihan2_13 {
    public static String stringReverseRekursif(String str, int n) {
        if (n == 0) {
            return "";
        }
        return str.charAt(n - 1) + stringReverseRekursif(str, n - 1);
    }
    public static String stringReverseIterasi(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.print("Membalikkan String dengan Rekursif : ");
        System.out.println(stringReverseRekursif(str, str.length()));

        System.out.print("\nMembalikkan String dengan Iterasi : ");
        System.out.println(stringReverseIterasi(str));
	}
}