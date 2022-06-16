package Tugas4;

public class Node {
    public String data;
    public Node prev;
    public Node next;

    public Node(Node prev, String data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
