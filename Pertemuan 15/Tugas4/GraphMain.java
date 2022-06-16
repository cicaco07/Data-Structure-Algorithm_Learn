package Tugas4;

import java.util.Scanner;
public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, "Surabaya", "Malang");
        graph.addEdge(0, 4, "Surabaya", "Kediri");
        graph.addEdge(1, 2, "Malang", "Kediri");
        graph.addEdge(1, 3, "Malang", "Blitar");
        graph.addEdge(1, 4, "Malang", "Surabaya");
        graph.addEdge(2, 3, "Kediri", "Malang");
        graph.addEdge(3, 4, "Blitar", "Surabaya");
        graph.addEdge(3, 0, "Blitar", "Kediri");
        graph.printGraph();
        graph.degree(2);
        graph.printGraph();
    }
}
