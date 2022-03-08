import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Data Mahasiswa yang akan diinput : ");
        int dm = sc.nextInt();
        DataMahasiswa[] dmArray = new DataMahasiswa[dm];
        
        for (int i=0; i<dm; i++){
            Scanner input = new Scanner(System.in);
            dmArray[i] = new DataMahasiswa();
            System.out.println("Masukkan data mahasiswa ke-"+ (i+1) +" : ");
            System.out.print("Masukkan nama : ");
            dmArray[i].nama = input.nextLine();
            System.out.print("Masukkan nim : ");
            dmArray[i].nim = input.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            dmArray[i].jenisKelamin = input.nextLine();
            dmArray[i].jenisKelamin = input.nextLine();
            System.out.print("Masukkan IPK : ");
            dmArray[i].ipk = input.nextDouble();
            System.out.println("");
        }

        for (int j=0; j<dm; j++){
            System.out.println("Data Mahasiswa ke-"+(j+1));
            System.out.println("Nama : "+dmArray[j].nama);
            System.out.println("NIM : "+dmArray[j].nim);
            System.out.println("Jenis Kelamin : "+dmArray[j].jenisKelamin);
            System.out.println("Nilai IPK : "+dmArray[j].ipk);
            System.out.println("");
        }
    }
}
