package Tugas2;

public class DoubleLL {
    Node head;
    int size, idx;

    public DoubleLL(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int id, String judul, double rating){
        if (isEmpty()){
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int id, String judul, double rating, int index) throws Exception  {
        if (isEmpty()){
          addFirst(id, judul, rating);;  
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i=0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("");
                System.out.println("ID : "+ tmp.id);
                System.out.println(" Judul Film : "+ tmp.judul);
                System.out.println(" Rating : "+ tmp.rating);
                tmp = tmp.next;
            }
            System.out.println("Jumlah Data Film : " + size);
        } else {
            System.out.println("Data Film Masih Kosong");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size==1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong tidak dapat dihapus !");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        } 
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current= current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.id != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("\ndata tidak ditemukan");
        } else {
            System.out.println("\nid-" + key + " ditemukan pada posisi node ke-" + (index+1));
            System.out.println("\nIDENTITAS :\n\nid film : " + tmp.id + "\njudul film : " + tmp.judul+ "\nIMDB rating : " + tmp.rating);
        }
    }
    
    public void BubbleSort() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node tmp = head;
            while (tmp != null) {
                Node temp2 = tmp.next;
                while (temp2 != null) {
                if (tmp.rating > temp2.rating) {
                    double tempdata = tmp.rating;
                    tmp.rating = temp2.rating;
                    tmp.next.rating = tempdata;
                    }
                temp2 = temp2.next;
                }
            tmp = tmp.next;
            }
            Node printdata = head;
                while (printdata != null) {
                System.out.print(printdata.rating + "\t");
                printdata = printdata.next;
            } System.out.println();
        }
    }
}
