import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bangun ruang yang akan dihitung : ");
        System.out.println("1. Kubus ");
        System.out.println("2. Bola ");
        System.out.println("3. Tabung ");
        System.out.println("4. Kerucut ");
        System.out.println("5. Keluar ");
        int pilih = sc.nextInt();

        if(pilih==1){
            System.out.println("Masukkan jumlah kubus : ");
            int x = sc.nextInt();
            Kubus[] k1Array = new Kubus[x];
            
            for(int i=0; i<x; i++){
                System.out.println("Masukkan panjang sisi kubus ke-"+(i+1));
                int s = sc.nextInt();
                k1Array[i] = new Kubus(s);
                System.out.println("Volume kubus ke "+ (i+1) + ": " + k1Array[i].hitungVolumeKubus());
                System.out.println("Luas permukaan kubus ke "+ (i+1) + ": " + k1Array[i].hitungluasPermukaanKubus());
            }

        } else if (pilih==2){
            System.out.println("Masukkan jumlah Bola : ");
            int y = sc.nextInt();
            Bola[] b2Array = new Bola[y];
            
            for(int j=0; j<y; j++){
                System.out.println("Masukkan panjang jari-jari bola ke-"+(j+1));
                int r = sc.nextInt();
                b2Array[j] = new Bola(r);
                System.out.println("Volume bola ke "+ (j+1) + ": " + b2Array[j].hitungVolumeBola());
                System.out.println("Luas permukaan bola ke "+ (j+1) + ": " + b2Array[j].hitungluasPermukaanBola());
            }

        } else if (pilih==3){
            System.out.println("Masukkan jumlah Tabung : ");
            int z = sc.nextInt();
            Tabung[] t3Array = new Tabung[z];

            for(int k=0; k<z; k++){
                System.out.println("Masukkan panjang jari-jari tabung ke-"+(k+1));
                int r = sc.nextInt();
                System.out.println("Masukkan tinggi tabung tabung ke-"+(k+1));
                int t = sc.nextInt();
                t3Array[k] = new Tabung(r, t);
                System.out.println("Volume tabung ke "+ (k+1) + ": " + t3Array[k].hitungVolumeTabung());
                System.out.println("Luas permukaan tabung ke "+ (k+1) + ": " + t3Array[k].hitungluasPermukaanTabung());
            }

        } else if (pilih==4){
            System.out.println("Masukkan jumlah Kerucut : ");
            int w = sc.nextInt();
            Kerucut[] k4Array = new Kerucut[w];

            for(int l=0; l<w; l++){
                System.out.println("Masukkan panjang jari-jari kerucut ke-"+ (l+1));
                double r = sc.nextDouble();
                System.out.println("Masukkan tinggi kerucut ke-"+ (l+1));
                double t = sc.nextDouble();
                System.out.println("Masukkan panjang garis pelukis kerucut ke-"+ (l+1));
                double p = sc.nextDouble();
                k4Array[l] = new Kerucut(r, t, p);
                System.out.println("Volume kerucut ke "+ (l+1) + ": " + k4Array[l].hitungVolumeKerucut());
                System.out.println("Luas permukaan kerucut ke "+ (l+1) + ": " + k4Array[l].hitungluasPermukaanKerucut());
            }
            
        } else 
        System.out.println("Terima Kasih");
         
    }
}
