package minggu5;

import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for(int i=0; i<elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }

        int pilih;
        do {
        System.out.println("Pilih Menu :");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer ");
        System.out.println("3. Keluar ");
        pilih = sc.nextInt();
        switch (pilih){
            case 1:{
                System.out.println("==============================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i=0; i<elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat +" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }   
            } break;
            case 2:{
                System.out.println("====================================");
                System.out.println("Hasil Faktorial dengan Divide and Conquer");
                for (int i=0; i<elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat +" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
            } break;
            case 3:{
                System.out.println("Terima kasih !!");
            } break;
            }
        } while (pilih > 0 && pilih<3); 
    }
}
