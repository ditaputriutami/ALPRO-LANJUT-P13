public class Latihan1_13 {
    public static void printArrayRecursive(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArrayRecursive(arr, i + 1, n);
    }
    public static void printArrayIterasi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Elemen Array dengan Rekursif : ");
        printArrayRecursive(arr, 0, arr.length);

        System.out.print("\nElemen Array dengan Iterasi : ");
        printArrayIterasi(arr);
	}
}