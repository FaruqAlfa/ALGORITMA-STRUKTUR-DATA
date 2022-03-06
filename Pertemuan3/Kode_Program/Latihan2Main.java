package Pertemuan3.Kode_Program;
import java.util.Scanner;
public class Latihan2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Tanah: ");
        int jumlah = sc.nextInt();
        System.out.println();
        Latihan2[] tanah = new Latihan2[jumlah];


        for(int i = 0; i < jumlah; i++) {
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang: ");
            int p = sc.nextInt();
            System.out.print("Lebar: ");
            int l = sc.nextInt();
            tanah[i] = new Latihan2(p, l);
        }

        for(int i = 0; i < jumlah; i++){
            System.out.println("Luas tanah ke - " + (i + 1) + " = " + tanah[i].hitungLuasTanah());
        }

        int v = 0;
        int w = 0;
        for (int i = 0; i < tanah.length; i++) {
            if (tanah[i].hitungLuasTanah() > v) {
                v = tanah[i].hitungLuasTanah();
                w = i + 1;
            }
        }

        System.out.println("Tanah terluas: Tanah " + w);
    }

}