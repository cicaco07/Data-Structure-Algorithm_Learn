package Praktikum;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//import java.util.Iterator;

public class ContohList{
    //@SuppressWarnings("unchecked")
    public static void main(String[] args){
        //Praktikum 1
        /*List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen pertama : %d total elemen : %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
    
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 1 : %s total elemen : %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf("Elemen 1 : %s total elemen : %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names : " +names.toString());
        System.out.println();

        names.push("Mei-mei");
        System.out.printf("Elemen 1 : %s total elemen : %s elemen terakhir : %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names : "+ names.toString());*/
        
        //Praktikum 2
        /*Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for(String fr: fruits){
            System.out.printf("\t"+fr);
        }
        System.out.println("\n"+fruits.toString());
        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for(int i=0; i<fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println("");*/

        //Praktikum 3
        System.out.println("");
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("20123411", "Aryo", "62812312313");
        Mahasiswa m1 = new Mahasiswa("201235654", "Isla", "628124311155");
        Mahasiswa m2 = new Mahasiswa("201236978", "Roziq", "628125796969");

        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235654"), new Mahasiswa("201235123", "Yofandra", "6281293131"));
        System.out.println();
        lm.tampil();
    }
}