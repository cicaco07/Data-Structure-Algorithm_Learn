package Tugas;

import java.util.Scanner;
public class Main {

    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) throws Exception{
        QueueDLL DLQ = new QueueDLL();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian : ");
                    int nomor = sc1.nextInt();
                    System.out.print("Nama Penerima : ");
                    String nama = sc.nextLine();
                    System.out.println("");
                    DLQ.addLast(nomor, nama);
                    break;
                case 2:
                    DLQ.Dequeue();
                    break;
                case 3:
                    DLQ.print();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}

