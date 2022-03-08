public class Tabung {
    public double jariJari;
    public double tinggi;

    public Tabung(double r, double t){
        jariJari = r;
        tinggi = t;
    }

    public double hitungVolumeTabung(){
        return jariJari*tinggi*3.14;
    }

    public double hitungluasPermukaanTabung(){
        return 2*3.14*jariJari*(jariJari+tinggi);
    }
}
