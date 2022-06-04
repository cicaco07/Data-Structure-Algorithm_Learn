package Tugas3;

public class SLLMain {
    public static void main(String[] args) throws Exception{
        SingleLinkedList singll = new SingleLinkedList();
        singll.push("Bahasa");
        singll.push("Android");
        singll.push("Komputer");
        singll.push("Basis Data");
        singll.push("Matematika");
        singll.push("Algoritma");
        singll.push("Statistika");
        singll.push("Multimedia");
        singll.print();
        System.out.println("Data paling atas adalah : "+singll.peek());
    }
}
