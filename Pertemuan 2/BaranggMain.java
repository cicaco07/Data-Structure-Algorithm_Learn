public class BaranggMain {
    public static void main(String[] args){
        Barangg c1 = new Barangg();
        c1.nama = "Smartphone";
        c1.hargaSatuan = 200000;
        c1.jumlah = 2;

        int a = c1.hargaTotal(c1.hargaSatuan, c1.jumlah);

        System.out.println("Harga total = " + a);
        System.out.println("Diskon = " + c1.diskon(a));
        System.out.println("Harga bayar = " + c1.hargaBayar(c1.hargaTotal(c1.hargaSatuan, c1.jumlah),
        c1.diskon(c1.hargaTotal(c1.hargaSatuan, c1.jumlah))));
    }
}
