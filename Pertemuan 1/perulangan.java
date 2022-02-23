import java.util.Scanner;
public class perulangan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nim;
        long hasil;

        System.out.println(" ===================== ");
        System.out.println(" Masukkan NIM anda : ");
        hasil = sc.nextInt();
        nim = (int)(hasil%100); 
       
        if (nim < 10) {
            System.out.println(nim += 10);
        } else {
             System.out.println(" Digit terakhir : "+ nim);
        }

        for (int j = 0; j < nim; j++) {
            int hari = j % 7;
            if (hari == 0) {
                System.out.print("Senin, ");
            } else if (hari == 1) {
                System.out.print("Selasa, ");
            } else if (hari == 2) {
                System.out.print("Rabu, ");
            } else if (hari == 3) {
                System.out.print("Kamis, ");
            } else if (hari == 4) {
                System.out.print("Jum'at, ");
            } else if (hari == 5) {
                System.out.print("Sabtu, ");
            } else {
                System.out.print("Minggu, ");
            }
        }
    }
}
