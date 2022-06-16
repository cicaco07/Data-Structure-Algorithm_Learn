package Tugas;

import java.util.Scanner;
public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vertextotal, x, y;
        System.out.println("Masukkan berpaa banyak vertex : ");
        vertextotal = sc.nextInt();
        Graph graph = new Graph(vertextotal);

        /*graph.addEdge(0, 1);
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

        System.out.println("Masukkan <source> <destination>");
        int i = 0;
        while (i <= vertextotal){
            x = sc.nextInt();
            y = sc.nextInt();

            graph.addEdge(x, y);
            i++;
        }
        x = sc.nextInt();
        y = sc.nextInt();
        graph.addEdge(x, y);

        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}
