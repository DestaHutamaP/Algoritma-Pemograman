import java.util.*;

public class penjumlahan{

    
    public static void main(String[] args) {
      int x;
      int y;
      int hasil;
      Scanner scan = new Scanner(System.in);
      System.out.printf("Masukan nilai y = ");
      x = scan.nextInt();
      System.out.printf("Masukan nilai y = ");
      y = scan.nextInt();
      
      hasil = x + y;
      System.out.print("Hasil dari Penjumlahan x + y = " + hasil);
    } 
}