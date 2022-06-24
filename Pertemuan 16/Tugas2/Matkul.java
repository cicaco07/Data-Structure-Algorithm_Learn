package Tugas2;

public class Matkul {
    String kode, matKul, sks;

    Matkul(String kode, String matKul, String sks){
        this.kode=kode;
        this.matKul=matKul;
        this.sks=sks;
    }

    public String toString(){
        return kode + "\t\t" + matKul + "\t\t\t\t" + sks;
    }

    public void print(){
        System.out.println(kode+"\t\t"+matKul+"\t\t\t\t"+sks);
    }
}
