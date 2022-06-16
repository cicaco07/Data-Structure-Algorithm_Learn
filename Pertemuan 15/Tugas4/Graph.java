package Tugas4;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int index, int index2, String source, String destination) {
            //add edge
            list[index].addFirst(destination);

            //add back edge (for undirected)
            list[index2].addFirst(source);
        }

    public void degree(int source) throws Exception {
            //degree undirected graph
            System.out.println("degree vertex " + source + " : " + list[source].size());

            //degree directed graph
            //inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {

                }
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < list[source].size; i++) {
            if (i == destination) {
                list[source].remove(destination);

            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph Berhasil Dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    boolean graphType(boolean pilih) {
        return pilih;
    }
}
