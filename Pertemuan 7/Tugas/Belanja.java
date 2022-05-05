package Tugas;

public class Belanja {
    int size, top;
    Struk[] data;

    Belanja(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if(top == size-1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Struk st){
        if (!IsFull()){
            top++;
            data[top] = st;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            Struk x = data[top];
            top--;
            System.out.println("Data yang keluar : "+ x.idStruk + " "+ x.tanggal+ " " + x.namaBarang+ " "+x.jumlah + " "+ x.total);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas : "+data[top].idStruk+ " "+data[top].tanggal +" "+data[top].namaBarang+" "+data[top].jumlah+" "+data[top].total);
    } 
    
    public void print(){
        for (int i = top; i>=0; i--){
            System.out.println("ID Struk \t Tanggal \t Nama Barang \t Total \t Harga ");
            System.out.println(data[i].idStruk+"\t\t"+data[i].tanggal+"\t "+data[i].namaBarang+"\t "+data[i].jumlah+"\t"+data[i].total);
        } System.out.println("---------------------------------------");
    }

    public void clear(){
        if(!IsEmpty()){
            for(int i = top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
