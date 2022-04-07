package minggu6;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);

        System.out.println("-------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim terkecil");
        for (int i=0; i<jumMhs; i++){
            System.out.println("-------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("___________________________________");
        System.out.println("___________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari : ");
        System.out.print("NIM : ");
        int cari =  s.nextInt();

        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampil(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("==============================");
        System.out.println("Menggunkan Binary Search");
        data.selectionSort();
        posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
        data.Tampil(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("Pencarian Data berdasarkan Nama: ");
        System.out.println("Masukkan Nama mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cariNama = s1.nextLine();
        
        System.out.println("Menggunakan Sequential Search");
        int posisiNama = data. FindSeqSearchNama(cariNama);
        data.TampilPosisiNama(cariNama, posisiNama);
        data.TampilDataNama(cariNama, posisiNama);
    }
}
