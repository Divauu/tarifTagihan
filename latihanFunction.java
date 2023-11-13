package BuAul;

import java.util.Scanner;

public class latihanFunction {
    
    // static void tampilNama(String nama){
    //     System.out.print("Hello " +nama);
    // }
    // static void tampilKelas(){
    //     System.out.print(" Kelas XRPL 8");
    // }

    // public static void main(String[] args) {
    //     tampilNama("Diva");
    //     tampilKelas();
        
    // }
    static void tampilNama(int id){
        String namaPelanggan[]={"Ali", "Budi", "Dani", "Edi", "Umar"};
        System.out.println(namaPelanggan[id-1]);
    }

    static void hitungTarif(int jumlahPakai){
    int harga = 0;
        if (jumlahPakai >0 || jumlahPakai<10) {
            harga = jumlahPakai*2000;
        }
        else if(jumlahPakai>=11 && jumlahPakai<=20){
            harga = jumlahPakai*3000;
        }
        else if(jumlahPakai>=21 && jumlahPakai<=30){
            harga = jumlahPakai*4000;
        }
        else if(jumlahPakai>=31){
            harga = jumlahPakai*5000;
        }
        System.out.println(harga+10000);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ID: ");
        int angka = input.nextInt();
        System.out.println("Nama pelanggan: "+angka);
        tampilNama(angka);
        
        System.out.println("Jumlah pakai: ");
        int jumlah = input.nextInt();
        System.out.println("Jumlah pemakaian: "+jumlah);
        hitungTarif(jumlah);

        
    }

}
