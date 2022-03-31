# **Laporan Praktikum 5**
# Jobsheet V - Sorting (Bubble, Selection, dan Insertion Sort) 
#### Oleh : Aryo Deva Saputra (TI-1G)
#### NIM : 2141720176

## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK menggunakan Bubble Sort
### 5.2.1 Langkah-langkah Percobaan 
<img src="img/../../img/Screenshot%20(427).png">
<img src="img/../../img/Screenshot%20(431).png">
<img src="img/../../img/Screenshot%20(428).png">

### 5.2.2 Verifikasi Hasil Percobaan
<img src="img/../../img/Screenshot%20(429).png">
<img src="img/../../img/Screenshot%20(430).png">

### 5.2.3 Pertanyaan

1. Terdapat di method apakah proses bubble sort?
**Terdapat pada method void bubbleSort()**
2. Terdapat di method apakah proses selection sort?
**Terdapat pada method void selectionSort**
3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan 
proses swap tersebut!
**Proses swap adalah proses untuk menukarkan nilai**
4. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
   <img src="img/../../img/Screenshot%202022-03-31%20141355.png">
   Untuk apakah proses tersebut?
**untuk proses swap atau pertukaran.**
**Nilai akan dibandingkan terlebih dahulu dengan indeks setelahnya apabila nilai lebih besar maka akan ditukar**
5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
    <img src="img/../../img/Screenshot%202022-03-31%20141518.png">
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
**jika perulangan i digunakan untuk mengeloop array dan j untuk mengeloop array sesudah array i agar bisa di bandingkan** 
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
**karena ada perulangan J yang mengeloop sampai listmhs, saat i = 0 maka akan di loop sampai array.length - 0  yang berarti di loop j pertama dari 1 sampai array.length**
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
**karena untuk membandingkan dengan array i**
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
**49 for dan 1225 tahapan**

## 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK menggunakan Selection Sort
### 5.3.1 Langkah-langkah Percobaan 
<img src="img/../../img/Screenshot%20(433).png">
<img src="img/../../img/Screenshot%20(434).png">

### 5.3.2 Verifikasi Hasil Percobaan
<img src="img/../../img/Screenshot%20(432).png">

### 5.3.3 Pertanyaan
1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
<img src="img/../../img/Screenshot%202022-03-31%20142355.png">
Untuk apakah proses tersebut, jelaskan!
Jika nilai j lebih kecil daripada i yang sebelumnya maka index terkecil akan berubah di j

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK menggunakan Insertion Sort
### 5.4.1 Langkah-langkah Percobaan 
**Jawaban ada di source code**

### 5.4.2 Verifikasi Hasil Percobaan
**Jawaban ada di source code**

### 5.4.3 Pertanyaan
**Jawaban ada di source code**

## 5.5 Latihan Praktikum
<img src="img/../../img/Screenshot%20(442).png">
<img src="img/../../img/Screenshot%20(443).png"> 