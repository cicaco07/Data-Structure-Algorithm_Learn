# **Laporan Praktikum**
# Jobsheet IX - Linked List 
#### Oleh : Aryo Deva Saputra (TI-1G)
#### NIM : 2141720176

## 2 Praktikum 
### 2.1 Pembuatan Single Linked List 
<img src="img/../../img/1.png">
<img src="img/../../img/2.jpg">
<img src="img/../../img/3.jpg">
<img src="img/../../img/4.jpg">

#### 2.1.1 Verifikasi Hasil Percobaan
<img src="img/../../img/5.png">

#### 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong” ?
   > **Karena tidak ada data awal pada linked list tersebut, sehingga ketika method isEmpty dijalankan bernilai true yang artinya linked list kosong**
2. Pada step 10, jelaskan kegunaan kode berikut !
```java
ndInput.next = temp.next;
            temp.next = ndInput;
```
> **Agar data yang akan di inputkan sama dengan temp.next, setelah itu temp.next di isi dengan ndInput yang baru**
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut !
```java
if (temp.next.next==null) tail=temp.next;
```
> **Untuk mengecek kondisi apakah temp.next.next null, jika iya maka tail=temp.next**

### 2.2 Modifikasi Elemen pada Single Linked List
#### 2.2.1 Langkah-langkah percobaan
<img src="img/../../img/6.jpg">
<img src="img/../../img/7.jpg">
<img src="img/../../img/8.jpg">
<img src="img/../../img/9.jpg">

#### 2.2.2 Verifikasi Hasil Percobaan
<img src="img/../../img/10.jpg">

#### 2.2.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
   > **Agar penghapusan hanya dilakukan 1 kali**
2. Jelaskan kegunaan kode dibawah pada method remove
```java
else if (temp.next.data == key){
      temp.next = temp.next.next;
}
```
> **Untuk memindahkan alamat next yang lama ke alamat next yang baru setelah dilakukan penghapusan**
3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud masing-masing kembalian tersebut!
> **Jika return -1 berarti data masih kosong jika selain itu maka akan return index data key**

## Tugas
1. Buat method insertBefore untuk menambahkan node sebelum keyword yang diinginkan!
   ```java
   public void insertBefore(int key, int input){
        int index = indexOf(key);
        insertAt(index, input);
   }
   ```
2. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data.
<img src="img/../../img/12.jpg">
<img src="img/../../img/13.jpg">
<img src="img/../../img/14.jpg">
<img src="img/../../img/15.jpg">
<img src="img/../../img/16.jpg">
<img src="img/../../img/17.jpg">
<img src="img/../../img/18.jpg">

3. Buatlah Implementasi Stack berikut menggunakan Single Linked List
<img src="img/../../img/11.jpg">
<img src="img/../../img/19.jpg">
<img src="img/../../img/20.jpg">
<img src="img/../../img/21.jpg">
<img src="img/../../img/22.jpg">

4. Buatlah implementasi program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan KRS pada dosen DPA di kampus pada tugas jobsheet 8 menggunakan LinkedList. Implementasikan Queue pada antrian mahasiswa dengan menggunakan konsep LinkedList!