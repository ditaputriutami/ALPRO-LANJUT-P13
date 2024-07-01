public class PrintArrayIterasi {

    public static void printArrayIterative(int[] array) {
        // Gunakan loop for untuk iterasi melalui setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        printArrayIterative(myArray);
    }
}
