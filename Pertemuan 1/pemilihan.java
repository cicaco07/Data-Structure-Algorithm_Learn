import java.util.Scanner;
public class pemilihan{
    public static void main(String[] args){
        int tugas, uts, uas;
        float nilaiAkhir;
        String nilaiHuruf;

        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("Masukkan nilai Tugas :");
        tugas = sc.nextInt();
        System.out.println("Masukkan nilai UTS :");
        uts = sc.nextInt();
        System.out.println("Masukkan nilai UAS :");
        uas = sc.nextInt();
        
        nilaiAkhir = (float) ((0.2*tugas)+(0.35*uts)+(0.45*uas));
        System.out.println("Nilai Akhir = " + nilaiAkhir);

        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else {
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }

        if(nilaiHuruf == "E" || nilaiHuruf == "D"){
            System.out.println("TIDAK LULUS");
        } else{
            System.out.println("LULUS");
        }
        
    }
}