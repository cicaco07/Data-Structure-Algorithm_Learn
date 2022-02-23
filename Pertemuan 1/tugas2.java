import java.util.Scanner;
public class tugas2{
    
    static void Kecepatan(){
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jarak (km): ");
            double s = input.nextDouble();
            System.out.print("Masukkan waktu (jam): ");
            double t = input.nextDouble();
            double v = s/t;
            System.out.print("Kecepatan : " + v + " km/jam");
    }

    static void Jarak(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v = input.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double t = input.nextDouble();
        double s = v*t;
        System.out.print("Jarak : " + s + " km");
    }

    static void Waktu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak (km): ");
        double s = input.nextInt();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v = input.nextInt();
        double t = s/v;
        System.out.print("Waktu : " + t + " jam");
    }

    public static void main(String[] args){
        int pilih;
    do{
        System.out.println("");
        System.out.println("Silahkan pilih menu yang akan digunakan : ");
        System.out.println("1. Kecepatan ");
        System.out.println("2. Jarak ");
        System.out.println("3. Waktu ");
        System.out.println("4. Keluar");
        System.out.println("Pilih 1/2/3/4");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        pilih = input.nextInt();

        switch (pilih){
            case 1:{
                Kecepatan();
            } break;
            case 2:{
                Jarak();
            } break;
            case 3:{
                Waktu();
            } break;
            case 4:{
                System.out.println(" Terima Kasih ");
            }
            break;
            }
        } while (pilih >0 && pilih<4);
}
}