# **Laporan Praktikum ***
# Jobsheet VIII - Queue 
#### Oleh : Aryo Deva Saputra (TI-1G)
#### NIM : 2141720176

## 8.2 Praktikum 1
### 8.2.1 Langkah-langkah Percobaan 
<img src="img/../../img/1.png">
<img src="img/../../img/2.png">

### 8.2.2 Verifikasi Hasil Percobaan
<img src="img/../../img/3.png">

### 8.2.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
   > **Karena untuk menandakan bahwa nilai dari front dan rear masih belum ada atau antrian masih kosong adalah -1, size bernilai 0 karena data dalam antrian belum ada atau 0**
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
    if (rear == max -1){
        rear = 0;
    }
```
> **Jika elemen baru yang ditambahkan ke queue nilainya sama dengan batas maksimal ukuran queue maka rear akan diposisikan ke index ke-0** 
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
    if (front == max -1){
        front = 0;
    }
```
> **Jika elemen yang di dequeue berada pada index terakhir dari suatu queue, maka elemen yang akan menjadi front yang baru berada pada index ke-0**
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
   > **Karena tidak semua front selalu berada pada index ke-0, nilai front selalu berubah ubah sesaui dengan aksi yang telah dilakukan**
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```java
    i = (i +1) % max;
```
> **Ketika i sudah pada indeks paling terakhir dari array, i akan kembali ke 0. Dengan begitu sistem tidak akan mengeprint indeks diluar indeks array dan mengulang ke 0 jika i sudah pada indeks paling terakhir dari array**
6. Tunjukkan potongan kode program yang merupakan queue overflow!
   > Mencoba menambahkan elemen ke queue yang sudah penuh
```java
   if (IsFull()){
        System.out.println("Queue sudah penuh");
```
dan 
```java
    System.out.print("Masukkan data baru: ");
    int dataMasuk = sc.nextInt();
    Q.Enqueue(dataMasuk);
    break;
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
   > **Pada method Dequeue tidak perlu dirubah, saya hanya merubah method Enqueue dan main menjadi :**
   <img src="img/../../img/7.png">
   <img src="img/../../img/8.png">
   > **Hasil running program**
   <img src="img/../../img/9.png">
   <img src="img/../../img/10.png"> 

## 8.3 Praktikum 2
### 8.3.1 Langkah-langkah Percobaan 
<img src="img/../../img/4.png">
<img src="img/../../img/5.png">

### 8.3.2 Verifikasi Hasil Percobaan
<img src="img/../../img/6.png">

### 8.3.3 Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```java
    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
        break;
        }
```
> **Ketika masuk ke dalam case ke-2 dan data[front] mempunyai nilai atau tidak kosong, maka sistem akan mengprint data yang telah di dequeue tersebut**
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!
> **Kode Program**
<img src="img/../../img/11.png">
<img src="img/../../img/12.png">

> **Hasil running** 
<img src="img/../../img/13.png">

## 8.4 Tugas
1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1:
    a. Method peekPosition(data: int) : void 
    Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa
    b. Method peekAt(position: int) : void 
    Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut dapat dipanggil!
> **Kode program :**
<img src="img/../../img/14.png">
<img src="img/../../img/15.png">

> **Hasil Running :**
<img src="img/../../img/16.png">
<img src="img/../../img/17.png">

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class diagram berikut:  
> **Kode program :**
<img src="img/../../img/18.png">
<img src="img/../../img/19.png">
<img src="img/../../img/20.png">
<img src="img/../../img/21.png">
<img src="img/../../img/22.png">
<img src="img/../../img/23.png">


> **Hasil Running :**
<img src="img/../../img/24.png">
<img src="img/../../img/25.png">
<img src="img/../../img/26.png">
<img src="img/../../img/27.png">