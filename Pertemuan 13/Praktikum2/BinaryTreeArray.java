package Praktikum2;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray(){
        data = new int[10];
    }

    void popilateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void tranverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            tranverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+" ");
            tranverseInOrder(2*idxStart+2);
        }
    }

    void add(int key) {
        idxLast++;
        data[idxLast] = key;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
           System.out.print(data[idxStart] + " ");
           traversePreOrder(2 * idxStart + 1);
           traversePreOrder(2 * idxStart + 2);
        }
     }
  
     void traversePostOreder(int idxStart) {
        if (idxStart <= idxLast) {
           traversePostOreder(2 * idxStart + 1);
           traversePostOreder(2 * idxStart + 2);
           System.out.print(data[idxStart] + " ");
       }
     }
}
