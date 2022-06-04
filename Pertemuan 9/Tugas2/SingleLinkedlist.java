package Tugas2;

public class SingleLinkedlist {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List :\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void printHead(){
        Node tmp = head;
        System.out.println(tmp.data);
    }

    public void addFirst(char input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(char input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }

    public void insertAfter (int key, char input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail=ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(int key, char input){
        int index = indexOf(key);
        insertAt(index, input);
    }

    public void insertAt(int index, int input){
        if (index < 0){
            System.out.println("indeks salah");
        } else if (index == 0){
            addFirst((char)input);
        } else {
            Node temp = head;
            for (int i =0; i< index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node((char)input, temp.next);
            if (temp.next.next==null) tail=temp.next;
        }
    }

    public int getData(int index){
        Node tmp = head;
        for (int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }
}
