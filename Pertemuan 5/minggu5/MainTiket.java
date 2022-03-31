package minggu5;

public class MainTiket {
    public static void main(String[] args) {
        Tiketservice ts = new Tiketservice();
        Tiket t1 = new Tiket("Garuda Indonesia" , 700000 , "Bali" , "Surabaya");
        Tiket t2 = new Tiket("Asia One Air" , 400000 , "Bogor" , "Bali");
        Tiket t3 = new Tiket("Nusantara Air" , 500000 , "Jakarta" , "Bali");
        Tiket t4 = new Tiket("Sriwijaya Air" , 1500000 , "Singapore" , "Bali");
        Tiket t5 = new Tiket("Citilink" , 450000 , "Malang" , "Bali");

        ts.tambah(t1);
        ts.tambah(t2);
        ts.tambah(t3);
        ts.tambah(t4);
        ts.tambah(t5);

        System.out.println("Tiket sebelum disorting : ");
        ts.tampilAll();
        
        System.out.println("Tiket setelah disorting dengan bubblesort : ");
        ts.bubbleSort();
        ts.tampilAll();

        System.out.println("Tiket setelah disorting dengan selection sort : ");
        ts.selectionSort();
        ts.tampilAll();

    }
}
