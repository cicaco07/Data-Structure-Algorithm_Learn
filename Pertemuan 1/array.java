public class array {
    public static void main(String[] args){

        int [][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int aglonema = 0, keladi = 0, alocasia = 0, mawar = 0;
        int pendapatan;
        for (int a=0; a<4; a++){
            for(int b=0; b<4; b++){
                if (b==0){
                    aglonema += bunga[a][b];
                } else if (b==1){
                    keladi += bunga [a][b];
                } else if (b==2){
                    alocasia += bunga [a][b];
                } else {
                    mawar += bunga [a][b];
                }
            }
        }

        pendapatan = (10-1)*75000 + (5-2)*50000 + 15*60000 + (7-5)*10000;
        System.out.println("1. Jumlah stock bunga berdasarkan jenis bunga : ");
        System.out.println(" Jumlah stock bunga Aglonema adalah " + aglonema);
        System.out.println(" Jumlah stock bunga Keladi adalah " + keladi);
        System.out.println(" Jumlah stock bunga Alocasia adalah " + alocasia);
        System.out.println(" Jumlah stock bunga Mawar adalah " + mawar);
        System.out.println("2. Pendapatan Royal Garden jika semua bunga terjual habis :");
        System.out.println(" Pendapatan Royal Garden adalah Rp " + pendapatan);
    }
}
