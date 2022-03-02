public class Barangg {
    String nama;
    int hargaSatuan, jumlah;

    int hargaTotal(int a, int b){
        int ht;
        ht = a*b;
        return ht;
    }

    double diskon(int c){
        double hargaDiskon = 0;
        if (c > 100000){
            hargaDiskon = c*0.10;
        } else if (c >= 50000 && c <= 100000){
            hargaDiskon = c*0.05;
        }else {
            hargaDiskon = 0;
        }
        return hargaDiskon;
    }

    double hargaBayar(int d, double e){
        double hargaBayar=0;
        hargaBayar = d-e;
        return hargaBayar;
    }
}
