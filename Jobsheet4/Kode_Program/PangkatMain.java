package Jobsheet4.Kode_Program;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat [] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++){

            System.out.println("Masukkan nilai yang akan dipangkatkan ke- " + (i+1)+" : ");
           int nilai = sc.nextInt();
            System.out.println("Masukkan niai pemangkat ke- "+(i+1)+" : ");
           int pang = sc.nextInt();
            png[i] = new Pangkat(nilai, pang);
        }
        System.out.println("============================");
        System.out.println("Hasil Pangkat dengan Brute Force ");
        for (int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].PangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("=============================");
        System.out.println("Hasil Pangkat dengan Devide and Conquer ");
        for(int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].PangkatDC(png[i].nilai,png[i].pangkat));

        }
        System.out.println("=================================");
    }

}
