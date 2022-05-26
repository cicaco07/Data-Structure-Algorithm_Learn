package Tugas2;

import java.util.Scanner;
public class Main {
    
    public static void menu(){
        System.out.print("");
        System.out.println("|===================================|");
        System.out.println("| DATA FILM LAYAR LEBAR             |");
        System.out.println("|===================================|");
        System.out.println("| 1. Tambah Data Awal               |");
        System.out.println("| 2. Tambah Data Akhir              |");
        System.out.println("| 3. Tambah Data Index Tertentu     |");
        System.out.println("| 4. Hapus Data Pertama             |");
        System.out.println("| 5. Hapus Data Terakhir            |");
        System.out.println("| 6. Hapus Data Tertentu            |");
        System.out.println("| 7. Cetak                          |");
        System.out.println("| 8. Cari ID Film                   |");
        System.out.println("| 9. Urut Data Rating Film = DESC   |");
        System.out.println("| 10. Keluar                        |");
        System.out.println("|===================================|");
    }
    public static void main(String[] args) throws Exception{
        DoubleLL dll = new DoubleLL();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int pilih;

        do {
            menu();
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1 :
                    System.out.println("Masukkan Data Film Posisi Awal : ");
                    System.out.print("ID Film : ");
                    int id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul = sc2.nextLine();
                    System.out.print("Rating Film : ");
                    double rating = sc.nextDouble();
                    dll.addFirst(id, judul, rating);
                    System.out.print("");
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir : ");
                    System.out.print("ID Film : ");
                    int id1 = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul1 = sc2.nextLine();
                    System.out.print("Rating Film : ");
                    double rating1 = sc.nextDouble();
                    System.out.print("");
                    dll.addLast(id1, judul1, rating1);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film : ");
                    System.out.print("Urutan ke- : ");
                    int index = sc.nextInt();
                    System.out.print("ID Film : ");
                    int id2 = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul2 = sc2.nextLine();
                    System.out.print("Rating Film : ");
                    double rating2 = sc.nextDouble();
                    System.out.println("Data film ini akan masuk di urutan ke-"+index);
                    dll.add(id2, judul2, rating2, index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("Data Film pada indeks berapa yang ingin dihapus ? ");
                    int index1 = sc.nextInt();
                    dll.remove(index1);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    dll.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang dicari : ");
                    int id3 = sc.nextInt();
                    dll.indexOf(id3);
                    break;
                case 9:
                    System.out.println("Pengurutan data rating film DESC :");
                    dll.BubbleSort();
                    break;
                case 10:
                    System.out.println("Terima Kasih :");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}
