# Laporan Praktikum Pertemuan 5 JobSheet 4
### Nama  : Mukhamad Faruq Al Fahmi
### NIM   : 2141720066
### Kelas : TI-1G
### Absen : 23

## **SubBab 4.2.3**
1.	Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
   ** -	Karena jika nilai dari n sudah equals atau sama dengan1, maka program akan melakukan return 1, kemudian jika tidak maka nilai daripada variable n akan di kurang - 1,yang mana di setiap loop atau perulangan yang di lakukan pada method di kalikan dengan nilai sebelumnya dan kemudian program akan mereturn pada variable fakto.**
    2.	Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program! 
**-	Divide = faktorialDC(n-1) pengurangan pada nilai n.**
**-	Conquer = n*.faktorialDC(n-1) penyelesaian dengan rekursif.**
**-	Combine = n*faktorialDC(n-1) pengombinasian dengan perkalian.**
3.	Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan! 
**-	Memungkinkan , perulangan pada method faktorialBF() dirubah selain menggunakan for dapat juga di rubah menjadi perulangan jenis while maupun do while.**
<img src="https:https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet4/ScreenShootHasil/Faktorial%20while.png">
4.	Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut! 
<img src="https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet4/ScreenShootHasil/FaktorialTime.png">
5.	Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi? 
 **Ada seperti Gambar dibawah ini**
 <img src="https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet4/ScreenShootHasil/Faktorial1.png">
  <img src="https://github.com/FaruqAlfa/ALGORITMA-STRUKTUR-DATA/blob/main/Jobsheet4/ScreenShootHasil/Faktorial2.png">
  
  ## **SubBab 4.3.3**
  1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! 
  **-	Perbedaan dari method PangkatBF() dan PangkatDC yakni pada method pangkatBF() menggunakan fungsi iterative (fungsi yang melakukan perulangan yang melakukan proses perulangan terhadap sekelompok intruksi. Perulangan dilakukan dalam batasan syarat tertentu. Ketika syarat tersebut tidak terpenuhi lagi maka perulangan akan terhenti.). Seddangkan pada method pangkatDC() menggunakan fungsi rekursif yang mana pada fungsi ini perulangan yang terjadi akibat pengeksekusian suatu fungsi yang mana fungsi tersebut memanggil dirinya sendiri.**
2.	Pada method PangkatDC() terdapat potongan program sebagai berikut: 
if (n % 2 == 1)//bilangan ganjil
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2) * a);
            else
                return (PangkatDC(a, n / 2) * PangkatDC(a, n / 2));
  
  Jelaskan arti potongan kode tersebut 
  **-	Maksud dari potongan tersebut yakni apabila terdapat suatu bilangan ganjil maka program akan melakukan pembagian terhadap variuable n, yakni di bagi 2 kemudian dikalikan dengan method itu sendiri dan kemudian di kalikan lagi dengan variable a. namun apabila terdapat suatu bilangan genap maka program akan melakukan return/nilai balik dan di dalam return tersebut dilakukan pembagian terhadap variable n, yang mana variable n di bagi 2 dan kemudian di kalikan dengan method itu sendiri namun tidak dikalikan dengan nilai daripada variable a.**
  
