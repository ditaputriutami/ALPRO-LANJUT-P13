public class Latihan3_13 {
    public static int recursiveMinimum(int[] BilMin, int n) {
        if (n == 1) {
            return BilMin[0];
        }
        int min1 = recursiveMinimum(BilMin, n - 1);
        int min2 = BilMin[n - 1];
        return Math.min(min1, min2);
    }
    public static int iterativeMinimum(int[] BilMin) {
        int min = BilMin[0];
        for (int i = 1; i < BilMin.length; i++) {
            if (BilMin[i] < min) {
                min = BilMin[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] BilMin = {10, 20, 2, 3, 5};

        System.out.print("Mencari Elemen Terkecil dengan Rekursif: ");
        System.out.println(recursiveMinimum(BilMin, BilMin.length));

        System.out.print("\nMencari Elemen Terkecil dengan Iterasi: ");
        System.out.println(iterativeMinimum(BilMin));
	}
}