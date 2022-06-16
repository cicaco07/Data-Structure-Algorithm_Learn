package Praktikum;

public class GraphArray {
    int vertices;
    int[][] array2D;

    GraphArray(int v){
        vertices = v;
        array2D = new int[vertices + 1][vertices +1];
    }

    void makeEdge(int to, int from, int edge){
        try {
            array2D[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
    }

    int getEdge(int to, int from){
        try {
            return array2D[to][from];
        } catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        } 
        return -1;
    }
}
