package Tugas;

public class QueueDLL {
    Node head;
    int size;

    public QueueDLL(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("***********************");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("***********************");
            System.out.println("|No.\t|Nama");
        while (tmp != null) {
            System.out.println("|" + tmp.no + "\t|" + tmp.nama);
            tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : " + size);
        } else {
            System.out.println("Linked List Queue Masih Kosong");
        }
    }

    public void addFirst(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
        } else {
            Node newNode = new Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong, tidak dapat di hapus");
            } else if (size == 1) {
        if (head.next == null) {
            System.out.println(head.nama + " Telah Selesai Di Vaksinasi");
            head = null;
            size--;
            return;
            }
            Node current = head;
            System.out.println(head.nama + " Telah Selesai Di Vaksinasi");
        while (current.next.next != null) {
            current = current.next;
        }
            current.next = null;
            size--;
        } else {
            System.out.println(head.nama + " Telah Selesai Di Vaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

}
