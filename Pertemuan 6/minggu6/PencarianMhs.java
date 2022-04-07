package minggu6;

public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;

    PencarianMhs(int length){
        this.listMhs = new Mahasiswa[length];
    }

    void tambah(Mahasiswa m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa m:listMhs){
            m.tampil();
            System.out.println("------------------");
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if(listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampil(int x, int pos){
        if (pos!= -1){
            System.out.println("Data : " +x+ " ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data : " +x+ " tidak ditemukan ");
        }
    }

    public void TampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim :"+x);
            System.out.println("Nama : "+listMhs[pos].nama);
            System.out.println("Umur : "+listMhs[pos].umur);
            System.out.println("IPK : "+listMhs[pos].ipk);
        } else {
            System.out.println("Data" +x+ "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right>= left){
            mid = (left+right) / 2;
            if (cari==listMhs[mid].nim){
                return (mid);
            } else if (listMhs[mid].nim> cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].nim < listMhs[idxMin].nim) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    public void TampilPosisiNama(String x, int pos){
        if (pos!=-1){
            System.out.println("Nama : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Nama : " + x + " tidak ditemukan");
        }
    }

    public void TampilDataNama(String x, int pos){
        if (pos!=-1){
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public int FindSeqSearchNama(String carinama){
        int posisi = -1;
        for (int j=0;j<listMhs.length;j++){
            if (listMhs[j].nama.equals(carinama)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
}
