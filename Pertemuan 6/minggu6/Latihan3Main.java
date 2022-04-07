package minggu6;

public class Latihan3Main {
    public static void main(String[] args){
        int[] data = { 12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Latihan3 a = new Latihan3(data, data.length);
        int posisi;
        a.tampilkan();
        System.out.println(" ");
        System.out.println("Setelah di sorting : ");
        a.selectionSort();
        a.tampilkan();
        a.findvalue();
        posisi = a.FindBinarySearch(a.max, 0, a.angka.length - 1);
        System.out.println();
        a.TampilPosisi(a.max, posisi);
    }
}
