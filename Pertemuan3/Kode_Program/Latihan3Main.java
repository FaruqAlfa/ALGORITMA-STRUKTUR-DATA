package Pertemuan3.Kode_Program;
import java.util.Scanner;
public class Latihan3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = input.nextInt();
        Latihan3[] mahaSiswa = new Latihan3[jumlah];
        for (int i = 0; i < mahaSiswa.length; i++) {
            mahaSiswa[i] = new Latihan3();
        }

        for(int i = 0; i < mahaSiswa.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
            input.nextLine();
            System.out.print("Masukkan Nama: ");
            mahaSiswa[i].nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            mahaSiswa[i].nim = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            mahaSiswa[i].jK = input.nextLine();
            System.out.print("Masukkan IPK: ");
            mahaSiswa[i].ipk = input.nextDouble();
        }
        System.out.println();

        for(int i = 0; i < jumlah; i++){
            System.out.println("\nData Mahasiswa ke - " + (i + 1));
            System.out.println("Nama: " + mahaSiswa[i].nama);
            System.out.println("NIM: " + mahaSiswa[i].nim);
            System.out.println("Jenis Kelamin: " + mahaSiswa[i].jK);
            System.out.println("IPK: " + mahaSiswa[i].ipk);
        }

    }
}
