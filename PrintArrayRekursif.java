public class PrintArrayRekursif {

    public static void printArray(int[] array, int index) {
        // Kondisi dasar
        if (index == array.length) {
            return;
        }

        // Cetak elemen array pada indeks saat ini
        System.out.println(array[index]);

        // Panggil method ini secara rekursif dengan indeks berikutnya
        printArray(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array, 0); // Memulai dari indeks 0
    }
}
