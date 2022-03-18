package Jobsheet4.Kode_Program;

import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Program Menghitung Keuntungan Total(Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah bulan");
        int elm = sc.nextInt();
        Sum sm = new Sum(elm);
        System.out.println("===============================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("============================================");
        System.out.println("Algoritma Brute Force: ");
        System.out.printf("Total Keuntungan perusahaan selama  %d bulan adalah = %.2f \n",sm.elemen,sm.totalBF(sm.keuntungan));
        System.out.println("Algoritma Devide Conquer: ");
        System.out.printf("Total Keuntungan perusahaan selama %d bulan adalah = %.2f ",sm.elemen,sm.totalDC(sm.keuntungan,0, sm.elemen-1));
    }
}

//printf("untuk mencetak funtion, %d untuk memanggil angka desimal, %.2f untuk membatasi angka dibelakang koma, prinf pada bagian belakang harus berisi fariabel")
