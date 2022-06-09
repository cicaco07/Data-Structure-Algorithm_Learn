package Praktikum;

public class BinaryTreeMain {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        //tugas 1
        /*bt.addrekursif(19);
        bt.addrekursif(17);
        bt.addrekursif(18);
        bt.addrekursif(24);
        bt.addrekursif(22);
        bt.addrekursif(20);
        bt.addrekursif(21);
        bt.addrekursif(26);*/

        bt.tranversePreOrder(bt.root);
        System.out.println("");
        bt.tranverseInOrder(bt.root);
        System.out.println("");
        bt.tranversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.tranversePreOrder(bt.root);
        System.out.println("");
        
        System.out.print("LEAF: ");
        bt.printLeaves(bt.root);
        System.out.println();
        System.out.println("Total LEAF: " + bt.total);

        System.out.println("Nilai Paling Kecil: " + bt.Min(bt.root));
        System.out.println("Nilai Paling Besar: " + bt.Max(bt.root));
        
    }
}
