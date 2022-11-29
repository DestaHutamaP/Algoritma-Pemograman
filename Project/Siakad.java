import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

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

    public static void urutData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Algoritma Pengurutan");
        System.out.println("1. Exchange Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. insertion Sort");
        System.out.println("5. Bubble Sort");
        System.out.println("Pilih Algoritma = ");
        int algo = scan.nextInt();
        switch(algo){
            case 1:
                exchangeSort();
            case 2:
                selectionSort();
            case 3:
                quickSort();
            case 4:
                insertionSort();
            case 5:
                bubbleSort();
        }

    }

    public static void exchangeSort(){
        for(int x = 0; x<jumlahData; x++){
            for(int y = x+1; y<jumlahData; y++){
                if(mahasiswa[x].getNim().compareTo(mahasiswa[y].getNim())>=1){
                Mahasiswa temp = mahasiswa[x];
                mahasiswa[x] = mahasiswa [y];
                mahasiswa [y] = temp;
                }
            }
        }
        menu();
    }

    public static void bubbleSort(){
        for(int i = 0; i<jumlahData-1;i++){
            for(int j=0;j<jumlahData-i-1;j++){
                if(mahasiswa[j].getNim().compareTo(mahasiswa[j+1].getNim())>=1){
                    Mahasiswa temp = mahasiswa[j];
                    mahasiswa[j] = mahasiswa[j+1];
                    mahasiswa[j+1] = temp;
                }
            }
        }
        menu();
    }

    public static void selectionSort(){
        for(int i = 0;i<jumlahData-1;i++){
            int min_x = i;
            for(int j = i+1;j<jumlahData;j++){
                if(mahasiswa[j].getNim().compareTo(mahasiswa[min_x].getNim())<=1){
                    min_x = j;
                    Mahasiswa temp = mahasiswa[min_x];
                    mahasiswa[min_x] = mahasiswa[i];
                    mahasiswa[i] = temp;
                }   
            }
        }
        menu();
    }

    public static void quickSort(){
        int high;
    }
    public static void insertionSort(){ //masih salah
        for(int i=1;i<jumlahData;i++){
            int j = i-1;
            while(j>=0){
                while(mahasiswa[j].getNim().compareTo(mahasiswa[i].getNim())<=1){
                    mahasiswa[j+1] = mahasiswa[j];
                    j = j-1;
                }
            }
            mahasiswa[j+1] = mahasiswa[i];
        }
        menu();
    }

    /*public static void shellSort(){
        for(int gap = jumlahData/2;gap>0;gap /= 2){
            for(int i = gap; i<jumlahData;i+=1){
                Mahasiswa temp = mahasiswa[i];
                for(int j = i;j>=gap && mahasiswa[j-gap].getNim().compareTo(mahasiswa[i].getNim());j-=gap){

                }
            }
        }
    }*/

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Menu Siakad\n" + "1. Tambah Data\n" + "2. Lihat Data\n" + "3. Urutkan Data\n" + "4. Exit" );
            System.out.print("Pilih Menu = ");
            int s = scan.nextInt();
            switch(s){
                case 1:
                    tambahData();
                case 2:
                    lihatData();
                case 3:
                    urutData();
                case 4:
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

