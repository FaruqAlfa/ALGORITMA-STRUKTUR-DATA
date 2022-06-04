package KUIS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        doubleLinkedList DL = new doubleLinkedList();
        System.out.println("========== QUIZ 2 PRAKTIKUM ASD TI - 1G dan TI - 1F ==========");
        System.out.println("dibuat oleh : Mukhamad Faruq Al Fahmi");
        System.out.println("NIM: 2141720066");
        System.out.println("Absen: 23");
        System.out.println("==============================================================");
        System.out.println("Sistem Antrian Resto Royal Delish");
        int balikmenu;
        do {
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("Pilih(1 - 5): ");
            int pilih = sc.nextInt();

            if (pilih == 1){
                sc.nextLine();
                System.out.println("---------------------------");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("---------------------------");
                System.out.print("Nomor Antrian: ");
                int antrian = sc.nextInt();
                System.out.print("Nama Customer: ");
                String nama = sc.nextLine();
                System.out.print("Nomor Hp: ");
                String noHp = sc.nextLine();
            }
            else if (pilih == 2){
                System.out.println("+++++++++++++++++++++++++");
                System.out.println("Daftar Antrian Resto Royal Delish");
                System.out.println("+++++++++++++++++++++++++");
            }

            else if (pilih == 3){
                System.out.println("Telah memesan Menu");
                System.out.println("----------------------------");
                System.out.println("Trnasaksi Input Pesanan");
                System.out.println("----------------------------");

            }
            else if (pilih == 4){
                System.out.println("++++++++++++++++");
                System.out.println("Daftar Pesanan Masuk resto royal delish");
                System.out.println("+++++++++++++++");
            }

            else if (pilih == 5){
                System.out.println("++++++++++");
                System.out.println("Total Pendapatan");
                System.out.println("+++++++++");
            }


        } while (balikmenu);
        }
    }
