public class tugas1{
    public static void main(String[] main){
        int ani=4, budi=15, bina=6, cita=11;
        double total;
        int biaya = 4500;
        double tBudi, tCita;
        tBudi = ((budi*biaya)-(budi*biaya*0.05));
        tCita = ((cita*biaya)-(cita*biaya*0.05));
        System.out.println("Harga Laundry per Orang : ");
        System.out.println("Ani  = Rp." + (ani*biaya));
        System.out.println("Budi = Rp." + tBudi);
        System.out.println("Bina = Rp." + (bina*biaya));
        System.out.println("Cita = Rp." + tCita);

        total = ((ani*biaya)+tBudi+(bina*biaya)+tCita);
        System.out.println("Total Pendapatan Smile Laundry adalah : Rp." +total);
        
    }
}