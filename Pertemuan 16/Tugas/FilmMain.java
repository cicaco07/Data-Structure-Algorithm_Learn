package Tugas;

import java.util.*;
public class FilmMain {
    public static void main(String[] args) {
        DaftarFilm df = new DaftarFilm();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int i=0;
        while(i<1){
            System.out.println("======================================");
            System.out.println("Daftar Film Layar Lebar Sepanjang Masa");
            System.out.println("======================================");
            System.out.println("1. Input Data Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Data Film Teratas");
            System.out.println("4. Info Semua Data Film");
            System.out.println("0. Keluar");
            System.out.println("============================");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.print("ID Film : ");
                String idFilm = sc2.nextLine();
                System.out.print("Judul Film : ");
                String judulFilm = sc2.nextLine();
                System.out.print("Tahun Tayang : ");
                String tahunTayang = sc2.nextLine();
                System.out.print("Director : ");
                String director = sc2.nextLine();
                Film film = new Film(idFilm, judulFilm, tahunTayang, director);
                df.push(film);
            } else if (pilih==2) {
                df.pop();
            } else if (pilih==3) {
                df.peek();
            } else if (pilih==4) {
                df.tampil();
            } else {
                i++;
            }
        } sc.close();sc2.close();
    } 
}
