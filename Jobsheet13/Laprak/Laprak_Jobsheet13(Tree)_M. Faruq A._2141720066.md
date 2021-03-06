### Nama: Mukhamad Faruq Al Fahmi
### Klas: 1G
### NIM: 2141720066
### Absen: 23

# Jawaban Pertanyaan Percobaan Jobsheet 13


## Pertanyaan Percobaan 2.1.2

 1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
 
**Jawab: karena pada Binary Search Tree terdapat aturan bahwa setiap child node sebelah kiri selalu lebih kecil nilainya dari pada root node. Begitu pula sebaliknya, setiap child node sebelah kanan selalu lebih besar nilainya daripada root node, yang dapat memberikan proses efisiensi pada proses searching.**

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

**Jawab: untuk menentukan leftchild dan reightchild. kegunaan left dan right sama seperti next dan prev**

3. a.  Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

	**Jawab: kegunaan dari root adalah untuk menentukan nilai paling atas**
   
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
   
	**Jawab: null atau kosong**

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

	**Jawab: proses penginputan node ke dalam root**

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah 
ini. Jelaskan secara detil untuk apa baris program tersebut?
if(data<current.data){
 if(current.left!=null){
 current = current.left;
 }else{
 current.left = new Node(data);
 break;
 }
 
 
**Jawab: jika data baru kurang dari data lama maka di lakukan pengecekan lagi apakah data 
kiri bernilai sama dengan null, jika iya data lama akan maka akan masuk ke dalam data kiri, 
jika tidak maka data kiri di ganti dengan data yang baru saja di masukkan, setelah itu break**

**output Binary Tree**

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Output_BinaryTree.png>

## Pertanyaan Percobaan 13.2.1
1.  Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?

	**Jawab: data untuk mendeklarasikan banyaknya nilai array dan IdxLast untuk menentukan alamat agar tidak eror waktu add**

2. Apakah kegunaan dari method populateData()?

	**Jawab: untuk menginput data agar dikenali indexnya**

3. Apakah kegunaan dari method traverseInOrder()?

	**Jawab:untuk mengeprint secara inOrder atau mengeprint seluruh data pada tree secara rekursif mulai dari sebelah kiri**

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?

	**Jawab: left = 1 dan right 3**
	
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

	**Jawab: untuk melimit index agar hanya menjadi 6**
	
	**Output Binary Tree Array**
	<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Output_BinaryTreeArray.png>


Tugas Praktikum 13.3
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.

<img src=https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas1.png >

**fungsi Main**

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas%201(main).png>

2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas2.png>

**Fungsi Main**

<img src = https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas2(main).png>

3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.

4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.
**Jawaban Nomor 3 dan 4**

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas3%264.png>

**Jawaban Nomor 3 dan 4 Main**

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas%203%264(Main).png>

5. Modifikasi class BinaryTreeArray, dan tambahkan : 
??? method add(int data) untuk memasukan data ke dalam tree 

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas%205%20a.png>

??? method traversePreOrder() dan traversePostOrder()

<img src= https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet13/ScreenShootHasil/Jobsheet13_Tugas%205%20b.png>
