# **Laporan Praktikum**
# Jobsheet XII - Graph 
#### Oleh : Aryo Deva Saputra (TI-1G)
#### NIM : 2141720176

## 2 Praktikum 
### 2.1 Implementasi Graph menggunakan Linked List
### 2.1.1 Langkah-langkah percobaan
<img src="img/../../img/1.jpg">
<img src="img/../../img/2.jpg">
<img src="img/../../img/3.jpg">
<img src="img/../../img/4.jpg">
<img src="img/../../img/5.jpg">
<img src="img/../../img/6.jpg">
<img src="img/../../img/7.jpg">
<img src="img/../../img/8.jpg">
<img src="img/../../img/9.jpg">
<img src="img/../../img/10.jpg">
<img src="img/../../img/11.jpg">

### 2.1.2 Verifikasi Hasil Percobaan
<img src="img/../../img/12.jpg">

### 2.1.3 Pertanyaan Percobaan
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah kegunaan algoritma-algoritma tersebut?
   <ul>a. Pencarian Melebar (Breadth First Search) digunakan untuk pencarian jalur</ul>
   <ul>b. Algoritma Bellman-Ford Untuk mencari lintasan terpendek </ul>
   <ul>c. Algoritma Boruvska Untuk menentukan pohon penjangkau minimum</ul>
2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan pembuatan variabel tersebut ?
   > **Untuk memanggil objek linked list kemudian mengubahnya menjadi objek array yang nanti akan diisi oleh vertex**
3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
   > **Untuk menggenalkan data dari depan.**
4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?
   > **Dengan cara melakukan looping pada edge. Jika vertex lebih besar dari I dan destination sama dengan I maka edge akan otomatis di hapus**
5. Kenapa pada praktikum 2.1.1 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?
```java
    graph.removeEdge(1, 3);
    graph.printGraph();
```
> **Hasil running tidak mengalami error tapi data vertex yang di outputkan akan mengalami perubahan lintasan/path**

### 2.2 Implementasi Graph menggunakan Matriks
### 2.2.1 Langkah-langkah percobaan
<img src="img/../../img/13.jpg">
<img src="img/../../img/14.jpg">
<img src="img/../../img/15.jpg">

### 2.2.2 Verifikasi Hasil Percobaan
<img src="img/../../img/16.jpg">

### 2.2.3 Pertanyaan Percobaan
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
   > **Directed graph degree mempunyai nilai yang berbeda karena terdapat in out, sedangkan Undirected graph degree mempunyai nilai yang sama karena tidak terdapat in out**
2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?
```java
    GraphArray(int v){
        vertices = v;
        array2D = new int[vertices + 1][vertices +1];
    }
```
> **Karena index di mulai dari 0, agar vertex dalam matrix bernilai sama dengan vertex yang seharusnya maka harus di tambah dengan 1**
3. Apakah kegunaan method getEdge() ?
   > **Untuk menamoilkan vertex tersedia atau tidak**
4. Termasuk jenis graph apakah uji coba pada praktikum 2.2?
   > **Directed graph**
5. Mengapa pada method main harus menggunakan try-catch Exception ?
   > **Agar program yang error bisa tetap berjalan dan tidak terhenti**

## 3. Tugas Praktikum
1.  Ubahlah lintasan pada praktikum 2.1 menjadi inputan!
<img src="img/../../img/17.jpg">
<img src="img/../../img/19.jpg">
<img src="img/../../img/18.jpg">

> Hasil running program
<img src="img/../../img/20.jpg">

2. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum 2.1
   > 
   <img src="img/../../img/23.jpg">
   <img src="img/../../img/24.jpg">
   > Hasil running program
   <img src="img/../../img/21.jpg">
   <img src="img/../../img/22.jpg">
   
   
3. Modifikasi method removeEdge() pada praktikum 2.1 agar tidak menghasilkan output yang salah untuk path selain path pertama kali!
   > 
   <img src="img/../../img/25.jpg">
   <img src="img/../../img/26.jpg">
   > Hasil running program
   <img src="img/../../img/27.jpg">

4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 2.1 dan 2.2 dari Integer menjadi tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Gresik, Bandung, Yogya, Malang, dst.
   > *Source code ada di folder tugas 4*
   > Hasil running program 
   <img src="img/../../img/30.jpg">
   