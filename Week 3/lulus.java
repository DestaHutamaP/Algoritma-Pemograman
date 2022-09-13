import java.util.*;

public class lulus{
    
    public static void main(String[] args) {
        String nama;
        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        nama = scan.next();
        System.out.print("Masukan Nilai : ");
        nilai = scan.nextInt();

        if(nilai < 75){
            System.out.println("Nama : " + nama);
            System.out.println("Keterangan : Tidak Lulus");
        }else{
            System.out.println("Nama : " + nama);
            System.out.println("Keterangan : Lulus");
        }
    } 
}