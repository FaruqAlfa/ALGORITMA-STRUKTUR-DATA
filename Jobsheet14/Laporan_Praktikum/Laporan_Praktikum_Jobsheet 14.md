### Nama: Mukhamad Faruq Al Fahmi
### Klas: 1G
### NIM: 2141720066
### Absen: 23

# Jawaban Pertanyaan Percobaan Jobsheet 14


## Pertanyaan Percobaan 2.1.3

 1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah 
kegunaan algoritma-algoritma tersebut?
 
**Jawab:**
**1. Pencarian Melebar (Breadth First Search atau BFS)**
**2. Pencarian Mendalam (Depth First Search atau DFS)**
**3. Algoritma Bellman-Ford Untuk mencari lintasan terpendek**
**4. Algoritma Boruvska Untuk menentukan pohon penjangkau minimu**

2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan 
pembuatan variabel tersebut ?

**Jawab: Untuk memanggil objek Linkedlist dan mengubahnya menjadi objek array yang mana 
nantinya akan di isi oleh vertex**

3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add 
jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
   
**Jawab: Alasannya adalah untuk dapat mengenalkan data dari depan**

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge 
pada graph ?

**Jawab: proses penginputan node ke dalam root**

5. Dengan cara looping edge, jika vertex lebih besar dari I dan destination sama dengan I maka 
edge akan otomatis di hapus

 
**Jawab: Output tidak error tapi data vertex yang di keluarkan mengalami perubahan path / lintasan**


## Pertanyaan Percobaan 2.2.3
1.  Apakah perbedaan degree/derajat pada directed dan undirected graph?

	**Jawab: Directed gaph degree mempunyai nilai yang berbeda karena terdapat in out
Sedangkan undirected degree mempunyai nilai yang sama karena tidak terdapat in out**

2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus 
ditambahkan dengan 1 pada indeks array berikut ?

**Jawab: Karena pada matriks index di mulai dari 0, agar vertex dalam matrix bernilai sama dengan 
vertex yang seharusnya maka harus di tambah +1**

3. Apakah kegunaan method getEdge() ?

	**Jawab:Untuk menampilkan apakah vertex tersedia atau tidak**

4. Termasuk jenis graph apakah uji coba pada praktikum 12.3 ?

	**Jawab: Jenis directed graph**
	

Tugas Praktikum
1. Ubahlah lintasan pada praktikum 2.1 menjadi inputan!

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet14/ScreenShoot_Program/Screenshot%20(799).png>


2. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk 
directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method 
graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum 
2.1
directed
<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet14/ScreenShoot_Program/Screenshot%20(801).png>

undirected
<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet14/ScreenShoot_Program/Screenshot%20(802).png>

3. Modifikasi method removeEdge() pada praktikum 2.1 agar tidak menghasilkan output yang salah 
untuk path selain path pertama kali!

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet14/ScreenShoot_Program/Screenshot%20(803).png>

4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 2.1 dan 2.2 dari Integer menjadi 
tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang 
awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Gresik, 
Bandung, Yogya, Malang, dst.


<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet14/ScreenShoot_Program/Screenshot%20(804).png>
