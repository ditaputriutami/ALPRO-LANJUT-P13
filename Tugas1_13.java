public class Tugas1_13 {
   public static int pangkat(int A, int B) {
      int hasil = 1;
         for (int i = 0; i < B; i++) {
            hasil *= A;
         }
         return hasil;
   }

   public static void main(String[] args) {
      int A = 2;
      int B = 3;

      int hasil = pangkat(A, B);
      System.out.println(A + "^" + B + " = " + hasil);
   }
}
