package Pertemuan3.Kode_Program;
import java.util.Scanner;
public class Latihan1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Masukkan Jumlah Array Limas Segi Empat: ");
        int limas = sc.nextInt();
        LimasSegiEmpat[] lsArray = new LimasSegiEmpat[limas];

        for(int i = 0; i < limas; i++){
            lsArray[i] = new LimasSegiEmpat();
            System.out.println("Limas Segi Empat ke- " + i);
            System.out.println("Masukkan alas1: ");
            lsArray[i].alas1 = sc.nextInt();
            System.out.println("Masukkan alas2: ");
            lsArray[i].alas2 = sc.nextInt();
            System.out.println("Masukkan Tinggi: ");
            lsArray[i].tinggi = sc.nextInt();
        }

        for(int i = 0; i < limas; i++){
            System.out.println("Limas Segi Empat ke- " + i);
            System.out.println("Luas Permukaan: " + lsArray[i].hitungLuasPermukaan() + ", volume: " + lsArray[i].hitugVolumeLimas());
        }

        System.out.println("Masukkan Jumlah Array Tabung: ");
        int tabung = sc.nextInt();
        Tabung[] tbArray = new Tabung[tabung];

        for(int i = 0; i < tabung; i++){
            tbArray[i] = new Tabung();
            System.out.println("Tabung ke- " + i);
            System.out.println("Masukkan jari jari: ");
            tbArray[i].jariJari = sc.nextInt();
            System.out.println("Masukkan Tinggi: ");
            tbArray[i].tinggi = sc.nextInt();
        }

        for(int i = 0; i < tabung; i++){
            System.out.println("Tabung ke- " + i);
            System.out.println("Luas Permukaan: " + tbArray[i].hitungLuasAlas() + ", volume: " + tbArray[i].hitungVolumeTabung());
        }

        System.out.println("Masukkan Jumlah Array Kubus: ");
        int kubus = sc.nextInt();
        Kubus[] ksArray = new Kubus[kubus];

        for (int i = 0; i < kubus; i++) {
            ksArray[i] = new Kubus();
            System.out.println("Kubus ke- " + i);
            System.out.println("Masukkan sisi: ");
            ksArray[i].sisi = sc.nextInt();
        }

        for (int i = 0; i < kubus; i++) {
            System.out.println("Kubus ke- " + i);
            System.out.println("Luas Permukaan: " + ksArray[i].hitungLuasAlas() + ", volume: " + ksArray[i].hitungVolumeKubus());
        }
    }
}
