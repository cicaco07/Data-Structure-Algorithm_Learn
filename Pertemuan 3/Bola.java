public class Bola {
    public double jariJari;

    public Bola(double r){
        jariJari = r;
    }

    public double hitungVolumeBola(){
        return 4/3*3.14*jariJari*jariJari*jariJari;
    }

    public double hitungluasPermukaanBola(){
        return 4*3.14*jariJari*jariJari;
    }
}
