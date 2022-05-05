package Tugas;

import java.util.Scanner;
public class BelanjaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("\t\t Struk Belanja ");
        System.out.println("===========================================");
        System.out.print("Masukkan Banyak Struk : ");
        int a = sc.nextInt();
        System.out.println("____________________________________________");
        Belanja bl = new Belanja(a);
        
        
        int totalHarga = 0;
        int jml, harga;
        for(int i = 0; i<a; i++){
            System.out.print("Masukkan ID Struk : ");
            String id = sc1.nextLine();
            System.out.print("Masukkan Tanggal Pembelian : ");
            String tgl = sc1.nextLine();
            System.out.print("Masukkan nama barang : ");
            String nb = sc1.nextLine();
            System.out.print("Masukkan jumlah barang : ");
            jml = sc.nextInt();
            System.out.print("Masukkan harga barang : ");
            harga = sc.nextInt();
            totalHarga = jml*harga;
            Struk st = new Struk(id, tgl, nb, jml, harga);
            bl.push(st);
            System.out.println("Total Harga Barang ke-"+(i+1)+" : "+totalHarga);
            System.out.println("----------------------------------------------------"); 
        }
        
        int u = 0;
        do {
            System.out.println(" ");
            System.out.println("Pilih menu dibawah ini : ");
            System.out.println("1. Tampil Struk ");
            System.out.println("2. Tampil Struk Teratas");
            System.out.println("3. Mengambil 5 struk untuk ditukar kupon ");
            System.out.println("4. Kosongkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            int pilih = sc.nextInt();
            
            if(pilih == 1){
                bl.print();
                continue;
            } else if (pilih == 2){
                bl.peek();
                continue;
            } else if (pilih == 3){
                bl.pop();
                bl.pop();
                bl.pop();
                bl.pop();
                bl.pop();
                bl.print();
            } else if (pilih == 4){
                bl.clear();
                continue;
            } else if (pilih == 0){
                System.out.println("Terima Kasih");
                break;
            } else {
                System.out.println("Menu yang anda pilih tidak ada");
                System.out.println("");
            }
        } while (u !=0 || u < 3);
    }
}
