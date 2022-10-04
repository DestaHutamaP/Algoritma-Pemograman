import java.util.Scanner;

public class Siakad{

    static Mahasiswa[]  mahasiswa = new Mahasiswa[1000];
    static int jumlahData = 0;

    public static void tambahData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Silahkan Tambah Data");
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("NIM : ");
        String nim = scan.nextLine();
        mahasiswa[jumlahData] = new Mahasiswa();
        mahasiswa[jumlahData].setNama(nama);
        mahasiswa[jumlahData].setNim(nim);
        jumlahData++;
        menu();
    }

    public static void lihatData(){
        System.out.println("Berikut Data Diri Anda : ");
        int i = 0;
        while (i<jumlahData){
            System.out.println(mahasiswa[i].getNama() + "  " + mahasiswa[i].getNim());
            i++;
        }
        menu();
    }

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Menu Siakad\n" + "1. Tambah Data\n" + "2. Lihat Data\n" + "3. Exit" );
            System.out.print("Pilih Menu = ");
            int s = scan.nextInt();
            switch(s){
                case 1:
                    tambahData();
                case 2:
                    lihatData();
                case 3:
                    System.exit(0);
                default:
                    menu();
            }
    }
    }
    public static void main(String[] args){
        menu();
    }
}

