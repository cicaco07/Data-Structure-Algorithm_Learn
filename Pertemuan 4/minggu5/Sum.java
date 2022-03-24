package minggu5;

public class Sum {
    public int elemen[];
    public int perusahaan[];
    public double keuntungan[];
    public double total;

    Sum(int elemen, int jumlahPrs){
        this.elemen = new int[elemen];
        this.keuntungan = new double[elemen];
        this.perusahaan = new int[jumlahPrs];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i=0; i<elemen.length; i++){
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[1];
        }
        else if(l<r){
            int mid=(l+r)/2;
            double lsum=totalDC(arr, l, mid-1);
            double rsum=totalDC(arr, mid+1, r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
