public class Kubus {
    public int sisi;

    public Kubus(int s){
        sisi = s;
    }

    public double hitungVolumeKubus(){
        return sisi*sisi*sisi;
    }

    public double hitungluasPermukaanKubus(){
        return 6*sisi*sisi;
    }
}
