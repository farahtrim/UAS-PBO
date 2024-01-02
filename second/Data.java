package second;

import java.util.Scanner;

public class Data extends AwalData {
    private String Nama;
    private String Alamat;
    private int NoHP;
    private int pilihan;
    private int pilihanMP;
    private int Harga;
    private int tanggal;
    private MetodePembayaran metodePembayaran;


    Scanner input = new Scanner(System.in);

    @Override
    public void data() {
        System.out.println("---------------------- Masukkan Data Anda--------------------------");
        System.out.println("Masukkan Nama Anda :  ");
        Nama = input.nextLine();
        System.out.println("Masukkan Alamat Anda :  ");
        Alamat = input.nextLine();
        System.out.println("Masukkan No HP Anda :  ");
        NoHP = input.nextInt();
        System.out.println("Masukkan Pilihan kamar :  ");
        pilihan = input.nextInt();
        System.out.println("Masukkan Tanggal Masuk Kamar pertama : ");
        tanggal = input.nextInt();
        System.out.println("Pilih Metode Pembayaran :  ");
        System.out.println("1. Tunai");
        System.out.println("2. Transfer");
        System.out.println("3. Dana");
        pilihanMP = input.nextInt();

        switch (pilihanMP){
            case 1:
                metodePembayaran = new MetodePembayaran("Tunai",MetodePembayaran.JenisMetodePembayaran.Tunai);
                break;
            case 2 :
                metodePembayaran = new MetodePembayaran("No Rek Mandiri : 1560020679751",MetodePembayaran.JenisMetodePembayaran.Transfer);
                break;
            case 3:
                metodePembayaran = new MetodePembayaran("No HP : 085812746381", MetodePembayaran.JenisMetodePembayaran.dana);
                break;
            default:
                System.out.println("Pilihan Anda tidak Valid");
                break;
        }
    }

    @Override
    public void harga() {
        switch (pilihan) {
            case 1:
                Harga = 1000000;
                System.out.println("Fasilitas kamar : AC + kamar Mandi Dalam");
                System.out.println("Harga Kamar : " + Harga);
                System.out.println("Pembayaran Setiap Tanggal : 27 ");
                break;
            case 2:
                Harga = 750000;
                System.out.println("Fasilitas kamar : AC + kamar Mandi luar");
                System.out.println("Harga Kamar : " + Harga);
                System.out.println("Pembayaran Setiap Tanggal : 27 " );
                break;
            case 3:
                Harga = 700000;
                System.out.println("Fasilitas kamar : Kipas + kamar Mandi Dalam ");
                System.out.println("Harga Kamar : " + Harga);
                System.out.println("Pembayaran Setiap Tanggal : 27 ");
                break;
            case 4:
                Harga = 500000;
                System.out.println("Fasilitas kamar : Kipas + kamar Mandi Luar");
                System.out.println("Harga Kamar : " + Harga);
                System.out.println("Pembayaran Setiap Tanggal : 27 ");
                break;
            default:
                System.out.println("Pilihan anda tidak valid");
                break;
        }
    }

    
    @Override
    public void output() {
        System.out.println("----------------- Bukti Sewa Kamar Kos Mami Rohimah------------------");
        System.out.println("Nama Penyewa : " + Nama);
        System.out.println("Alamat Penyewa : " + Alamat);
        System.out.println("No.Hp Penyewa : " + NoHP);
        System.out.println("Pilihan Kamar : " + pilihan);
        System.out.println("Tanggal Masuk Kamar : " + tanggal);
        System.out.println("Harga Kamar : " + Harga);
        System.out.println("Tanggal Jatuh Tempo Pembayaran : " + tanggal + " setiap bulan");
        System.out.println("Metode Pembayaran : " + metodePembayaran.getNama());
        System.out.println("Jenis Pembayaran : " + metodePembayaran.getJenis());
    }
}