# Laporan Praktikum Jobsheet 8
### Nama  : Mukhamad Faruq Al Fahmi
### NIM   : 2141720066
### Kelas : TI-1G
### Absen : 23

## **SubBab 8.2.2**  

<img src=>  

## **8.2.3 Pertanyaan**  

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0?  

**Karena jika front dan rearnya bernilai 0 maka tidak akan ada ruang untuk atribut size nya .**

2.  Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!  

**Jika rear ada di index terakhir dari array maka rear nya akan di set ke 0, maka rear tidak akan melewati batas maksimal indeks array**

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
**Apabila front berada pada indeks paling belakang maka front akan dipindahkan ke indeks paling depan**

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?  

**karena nilai front tidak selalu berada pada index ke 0, dan perulangan bisa di lakukan dari index manaoun sesuai yang di inginkan**

5. Pada method print, jelaskan maksud dari potongan kode berikut!  
```java
i = (i + 1) % max;
```
**potongan kode di atas digunakan agar nilai i tidak melebihi nilai max**  

6. Tunjukkan potongan kode program yang merupakan queue overflow!
```java
System.out.print("Masukkan data baru: ");
int dataMasuk = sc.nextInt();
Q.Enqueue(dataMasuk);
break;
```
dan
```java
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi 
queue overflow dan queue underflow, program dihentikan!

**Method Dequeue tidak perlu modifikasi sedangkan method Enqueue menjadi :**  

<img src= >  




## **8.3.3 Pertanyaan**  

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!  
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
            && data.saldo != 0) {
        System.out.println("Data yang dikeluarkan: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo);
        break;
    }
```  
**Ketika masuk ke case 2 dan data[front] mempunyai isi atau tidak sama dengan kosong, maka sistem akan mengprint data yang telah didequeue tersebut**

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!


<img src= >  

## **SubBab 8.4**  

1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1:

a. Method peekPosition(data: int) : void
Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan 
data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa

b. Method peekAt(position: int) : void
Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut 
dapat dipanggil!

<img src= >  
**Hasil Run**
<img src= >

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan 
KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus 
menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class 
diagram


<img src= >  
<img src= >  
<img src= >  
<img src= >  
<img src= >  
