import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Tanah :");
        int x = sc.nextInt();
        LuasTanah[] ltArray = new LuasTanah[x];

        for(int i=0; i<x; i++){
            System.out.println("Tanah ke-"+ (i+1));
            System.out.println("Panjang : ");
            int panjang = sc.nextInt();
            System.out.println("Lebar : ");
            int lebar = sc.nextInt();
            ltArray[i] = new LuasTanah(panjang, lebar);
        }

        for(int j=0; j<x; j++){
            System.out.println("Luas Tanah "+ (j+1) + ": " + ltArray[j].hitungLuastanah());
        }

        int a = 0, b = 0;
        for (int i = 0; i < ltArray.length; i++) {
            if (ltArray[i].hitungLuastanah() > a) {
                a = ltArray[i].hitungLuastanah();
                b = i + 1;
            } 
        } System.out.println("Tanah terluas : "+ b);
        

    }
}
