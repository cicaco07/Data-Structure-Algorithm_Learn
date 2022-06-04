package Tugas2;

public class SLLMain {
    public static void main(String[] args) throws Exception{
        SingleLinkedlist singll = new SingleLinkedlist();
        singll.print();
        singll.addFirst('a');
        singll.print();
        singll.insertAfter('a', 'c');
        singll.print();
        singll.insertBefore('c', 'b');;
        singll.print();
        singll.insertAt(3, 'd');
        singll.print();
        singll.addLast('e');
        singll.print();
        System.out.print("Nilai head : ");
        singll.printHead();
    }
}
