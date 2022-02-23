import java.util.Scanner;
public class fungsi {
    public static void main(String[] args) {
        int pilih;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("_______________________________________________");
            System.out.println("|       Selamat Datang di Royal Garden        |");
            System.out.println("|_____________________________________________|");
            System.out.println("|Silahkan Pilih Menu :                        |");
            System.out.println("| 1. Tampilkan stock bunga                    |");
            System.out.println("| 2. Tampilkan seluruh stock di seluruh cabang|");
            System.out.println("| 3. Keluar                                   |");
            System.out.println("|_____________________________________________|");
            System.out.println("Pilihan Menu Anda (1 / 2 / 3)");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 : {
                    System.out.println("Menu 1. Menampilkan Stock Bunga");
                    tampilkanStock();
                }break;
                case 2 : {
                    System.out.println("Menu 2. Menampilkan seluruh stock bunga di seluruh cabang");
                    tampilJumlah();
                }break;
                case 3 : {
                    System.out.println("Menu 3. Keluar Dari Program");
                }break;
            }
        }while(pilih > 0 && pilih <3);

        }

    private static void tampilkanStock() {
        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        System.out.println("                    Algonema         Keladi         Alocasia          Mawar");
        System.out.println("___________________________________________________________________________");
        System.out.println("Royale Garden 1" + "\t\t" + bunga[0][0] + "\t\t" + bunga[0][1] + "\t\t" + bunga[0][2] + "\t\t" + bunga[0][3]);
        System.out.println("___________________________________________________________________________");
        System.out.println("Royale Garden 2" + "\t\t" + bunga[1][0] + "\t\t" + bunga[1][1] + "\t\t" + bunga[1][2] + "\t\t" + bunga[1][3]);
        System.out.println("___________________________________________________________________________");
        System.out.println("Royale Garden 3" + "\t\t" + bunga[2][0] + "\t\t" + bunga[2][1] + "\t\t" + bunga[2][2] + "\t\t" + bunga[2][3]);
        System.out.println("___________________________________________________________________________");
        System.out.println("Royale Garden 4" + "\t\t" + bunga[3][0] + "\t\t" + bunga[3][1] + "\t\t" + bunga[3][2] + "\t\t" + bunga[3][3]);
        System.out.println("___________________________________________________________________________");
        System.out.println("");
    }
    
        private static void tampilJumlah() {
                int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, totalBunga;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    algonema += bunga[i][j];
                } else if (j == 1) {
                    keladi += bunga[i][j];
                } else if (j == 2) {
                    alocasia += bunga[i][j];
                } else {
                    mawar += bunga[i][j];
                }
            }
        }

        totalBunga = (algonema + keladi + alocasia + mawar);

        System.out.println("Jumlah Bunga di Seluruh Cabang: " + totalBunga);
        System.out.println("Jumlah Bunga Algonema   : " + algonema);
        System.out.println("Jumlah Bunga Keladi     : " + keladi);
        System.out.println("Jumlah Bunga Alocasia   : " + alocasia);
        System.out.println("Jumlah Bunga Mawar      : " + mawar);
    }
}