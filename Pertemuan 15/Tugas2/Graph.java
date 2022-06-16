package Tugas2;

import java.util.Scanner;
public class Graph {
    int vertex;
    boolean tipe;
    DoubleLinkedList list[];

    public Graph(int vertex, boolean tipe) {
        this.vertex = vertex;
        this.tipe = tipe;
        list = new DoubleLinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        if (graphType(tipe)) {
            list[source].addFirst(destination);
        } else {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        if(tipe==true){
        System.out.println("degree vertex " + source + " : " + list[source].size());
        
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree dari vertex " + source + " : " + (totalIn + totalOut));
        } else {
            System.out.println("degree vertex " + source + " : " + list[source].size()); 
        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < list[source].size(); i++) {
            if (destination==list[source].get(i)) {
                list[source].remove(i);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType(boolean tipe) {
        return tipe;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean tp;
        int pilih,x ,y;
        System.out.println("Berapa banyak edge : ");
        int edge = sc.nextInt();
        System.out.print("Tipe vertex?\n1. directed\n2. undirected\njawab: ");
        pilih = sc.nextInt();
        if (pilih == 1) {
            System.out.println("Anda menggunakan Directed Graph");
            tp = true;
        } else {
            System.out.println("Anda menggunakan Undirected Graph");
            tp = false;
        }

        // NO 3
        Graph graph = new Graph(edge, tp);
        System.out.println("Masukkan <source> <destination>");
        int i = 0;
        while (i<edge){
            x = sc.nextInt();
            y = sc.nextInt();

            graph.addEdge(x, y);
            i++;
        }

        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();

        // NO 2
        /*Graph graph = new Graph(6, tp);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();*/

        

        /*System.out.println("Masukkan jumlah vertex : ");
        int n = sc.nextInt();
        Graph graph = new Graph(n, tp);
        System.out.println("Masukkan vertex <source> <destination>");
        for (int i = 0; i < n + 2; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.addEdge(x, y);
        }*/


        /*graph.removeEdge(3, 0);
        graph.printGraph();
        graph.degree(2);*/
    }
}
