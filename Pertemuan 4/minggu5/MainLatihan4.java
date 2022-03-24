package minggu5;

import java.util.Scanner;
public class MainLatihan4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Pemilihan Suara Ketua BEM tahun 2022 +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Latihan4 lat = new Latihan4();
        Latihan4[] arr = new Latihan4[lat.jK];

        for (int i = 0; i<lat.jK; i++){
            arr[i] = new Latihan4();
            System.out.print("Nama kandidat ke - "+(i+1)+ " : ");
            arr[i].kandidat = sc.nextLine();
        }

        System.out.println("");
        for (int i = 0; i<lat.jK; i++){
            System.out.print("Masukkan jumlah suara Kandidat ke - "+(i+1)+" : ");
            arr[i].suara = sc.nextInt();
            lat.jS += arr[i].suara;
        }

        System.out.println("");
        int hasil = lat.Hitung(lat.jS, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if (hasil==0){
            System.out.println("Mayoritas masing-masing kandidat hampir sama");
        } else {
            System.out.println("Ketua BEM yang terpilih adalah : " + arr[hasil-1].kandidat);
        }
    }   
}
