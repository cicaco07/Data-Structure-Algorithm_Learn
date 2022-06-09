package Praktikum;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }
    boolean isEmpty(){
        return root==null;
    }

    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        } else {
            Node current = root;
            while(true){
                if(data<current.data){
                    if(current.left!=null){
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    } 
                } else if (data>current.data){
                    if(current.right!=null){
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                }
            }
        }
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current!=null){
            if(current.data==data){
                hasil = true;
                break;
            } else if (data<current.data){
                current = current.left; 
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void tranversePreOrder(Node node){
        if (node != null){
            System.out.println(" "+ node.data);
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }

    void tranversePostOrder(Node node){
        if (node != null){
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            System.out.println(" "+ node.data);
        }
    }

    void tranverseInOrder(Node node){
        if (node != null){
            tranverseInOrder(node.left);
            System.out.println(" "+ node.data);
            tranverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current!=null){
            if(current.data==data){
                break;
            } else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null){
            System.out.println("Tidak dapat menemukan data!");
            return;
        } else {
            if (current.left==null&&current.right==null){
                if(current==root){
                    root = null;
                } else {
                    if(isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left==null){
                if(current==root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right==null){
                if(current==root){
                    root = current.left;
                } else {
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if(current==root){
                    root = successor;
                } else {
                    if (isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void addrekursif(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    int Min(Node node) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int Max(Node node) {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    
    int total = 0;
    public void printLeaves(Node node) {
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            System.out.print(" " + node.data);
            total++;
        }
        printLeaves(node.left);
        printLeaves(node.right);
    }
}
