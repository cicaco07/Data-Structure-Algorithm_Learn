public class Kerucut {
    public double jariJari, tinggi, pelukis;

    public Kerucut(double j, double t, double s){
        jariJari = j;
        tinggi = t;
        pelukis = s;
    }

    public double hitungVolumeKerucut(){
        return 3.14*jariJari*jariJari*tinggi/3;
    }

    public double hitungluasPermukaanKerucut(){
        return 3.14*jariJari*(pelukis+jariJari);
    }
}
