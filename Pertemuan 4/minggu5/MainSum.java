package minggu5;

import java.util.Scanner;
public class MainSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int el = 0;
        System.out.println("===========================================");
        System.out.println("Program Menghitung Keuntungan Total ");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jumlahPrs = sc.nextInt();
        for (int i=0; i<jumlahPrs; i++){
            System.out.println("Masukkan jumlah bulan perusahaan ke- " + (i+1)+" : ");
            int elm = sc.nextInt();
            el = elm;
        }

        Sum sm = new Sum(el, jumlahPrs);
        System.out.println("===========================================");
        for(int i=0; i<jumlahPrs; i++){
            System.out.println("Perusahaan ke- " + (i+1));
            for (int j=0; j<el; j++){
            System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < jumlahPrs; i++) {
            System.out.println("Perusahaan ke- " + (i+1));
            System.out.println("====================================================");
            System.out.println("Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen[i] + " bulan : " + sm.totalBF(sm.keuntungan));
            System.out.println("====================================================");
            System.out.println("Devide Conque");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen[i] + " bulan : " + sm.totalDC(sm.keuntungan, 0, sm.elemen[i]-1));
        }
    }    
}
