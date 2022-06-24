package Tugas2;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[6];
        Matkul[] mk = new Matkul[5];
        ListNilai ln = new ListNilai();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        mhs[0] = new Mahasiswa("20001", "Thalhah", "089**");
        mhs[1] = new Mahasiswa("20002", "Zubair", "081**");
        mhs[2] = new Mahasiswa("20003", "Abdul", "082**");
        mhs[3] = new Mahasiswa("20004", "Sa'ad", "083**");
        mhs[4] = new Mahasiswa("20005", "Sa'id", "087**");
        mhs[5] = new Mahasiswa("20006", "Ubaidah", "085**");

        mk[0] = new Matkul("00001", "Basis Data", "3");
        mk[1] = new Matkul("00002", "Sistem Operasi", "2");
        mk[2] = new Matkul("00003", "Matematika", "2");
        mk[3] = new Matkul("00004", "Bhs. Inggris", "3");
        mk[4] = new Matkul("00005", "Pemrograman", "3");

        int i=0;
        while(i<1){
            System.out.println("===============================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("===============================================");
            System.out.println("| 1. Input Nilai                              |");
            System.out.println("| 2. Tampil Nilai                             |");
            System.out.println("| 3. Mencari Nilai Mahasiswa                  |");
            System.out.println("| 4. Urut Data Nilai                          |");
            System.out.println("| 5. Keluar                                   |");
            System.out.println("===============================================");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.println("Masukkan Data :");
                System.out.print("Nilai : ");
                double nilai = sc2.nextDouble();
                sc2.nextLine();

                System.out.println("DAFTAR MAHASISWA");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tTelf");
                for (int j=0; j<mhs.length; j++) {
                    mhs[j].print();
                }
                System.out.print("Pilih Mahasiswa By NIM : ");
                String nim = sc2.nextLine();
                Mahasiswa x = null;
                for(int j=0; j<mhs.length; j++){
                    if(nim.equals(mhs[j].nim)){
                        x = mhs[j];
                    }
                }

                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("Kode\t\tMata Kuliah\t\t\t\tSKS");
                for (int j=0; j<mk.length; j++) {
                    mk[j].print();
                }
                System.out.print("Pilih Mata Kuliah By Kode : ");
                String kode = sc2.nextLine();
                Matkul y = null;
                for(int j=0; j<mk.length; j++){
                    if(kode.equals(mk[j].kode)){
                        y = mk[j];
                    }
                }

                
                Nilai nilaiobj = new Nilai(x.nim, x.nama, y.matKul, y.sks, nilai);
                ln.add(nilaiobj);

            } else if (pilih==2) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
                ln.tampil();

            } else if (pilih==3) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
                ln.tampil();

                System.out.print("Masukkan Data Mahasiswa[NIM] : ");
                String nim = sc2.nextLine();
                ln.get(nim);

            } else if (pilih==4) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
                ln.sort();

            } else {
                i++;
            }
        }
        sc.close();sc2.close();
    }
}
