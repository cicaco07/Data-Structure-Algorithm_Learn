package Praktikum;

public class Graph {
    int vertex;
    DoubleLinkedList list[];
    Node right;

    Graph(int vertex){
        this.vertex = vertex;
        list = new DoubleLinkedList[vertex];
        for (int i=0; i<vertex; i++){
            list[i] = new DoubleLinkedList();
        }
    }

    void addEdge(int source, int destination){
        //dari
        list[source].addFirst(destination);

        //ke
        list[destination].addFirst(source);
    }

    void degree(int source) throws Exception {
        //undirected
        System.out.println("Degree vertex " + source + " " + list[source].size);

        //directed
        int k, totalIn = 0, totalOut = 0;
        for (int i=0; i<vertex; i++){
            for (int j=0; j<list[i].size(); j++){
                if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
        }

        //out
        for(k=0; k<list[source].size(); k++){
            list[source].get(k);
        }
        totalOut = k;
        System.out.println("Indegree "+source+ " = " + totalIn);
        System.out.println("Outdegree "+source+ " = " + totalOut);
        System.out.println("Degree "+source+ " = " +(totalIn+totalOut));
    }

    void removeEdge(int source, int destination) throws Exception {
        for (int i=0; i<vertex; i++){
            if(i==destination){
                list[source].remove(destination);
            }
        }
    }

    void removeAllEdge(){
        for (int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph sudah kosong ");
    }

    void printGraph() throws Exception {
        for (int i=0; i<vertex; i++){
            if(list[i].size()>0){
                System.out.println(" Vertex " +i+ " terhubung ke ");
                for (int j=0; j<list[i].size; j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}