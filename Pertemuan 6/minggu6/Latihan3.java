package minggu6;

public class Latihan3 {
    int[] angka;
    int[] index;
    int max = 0;
    int counter = 0;

    Latihan3(int[] y, int z){
        this.angka = new int[z];
        this.index = new int[z];
        angka = y; 
    }
    
    void tampilkan(){
        for(int i=0; i< angka.length; i++){
            System.out.print(angka[i]+ " ");
        }
    }

    void selectionSort(){
        for(int i = 0; i<angka.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j<angka.length; j++){
                if (angka[j] < angka[idxMin]){
                    idxMin = j;
                }
            }
            int tmp = angka[idxMin];
            angka[idxMin] = angka[i];
            angka[i] = tmp;
        }
    }

    void findvalue(){
        for (int i=0; i<angka.length; i++){
            if (angka[i] > max){
                max = angka[i];
            }
        }
    }

    void tampilAll(){
        System.out.println(" Angka terbesar adalah : "+ max);
        for (int i=0; i<angka.length; i++){
            if (angka[i] == max){
                counter++;
                index[i] = i;
            }
        }
        System.out.println("Jumlah nilai terbesar ada : " + counter);
        System.out.print("terdapat pada indeks : ");
        for (int i = 0; i < angka.length; i++) {
            if (index[i] != 0) {
                System.out.print(index[i] + " ");
            } else {
                continue;
            }
        }
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid=(left + right) / 2;
            if (cari == angka[mid]) {
                return (mid);
            } else if (angka[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    void TampilPosisi(int x, int pos) {
        if (pos != -1) {

            for (int i = 0; i < angka.length; i++) {
                if (angka[i] == x) {
                    counter++;
                    angka[i] = i;
                }
            }

            System.out.print("data " + x + " ditemukan sebanyak " + counter + " buah\nterletak pada indeks : " + pos);
            for (int i = 0; i < angka.length; i++) {
                if (angka[pos] == angka[i]) {
                    index[i] = i;
                } if (index[i] != 0 && i!=pos) {
                    System.out.print(" " + index[i]);
                }
            }
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
    
}
