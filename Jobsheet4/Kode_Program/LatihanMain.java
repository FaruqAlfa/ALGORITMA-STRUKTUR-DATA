package Jobsheet4.Kode_Program;

import java.util.Scanner;

public class LatihanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Banyak Suara : ");
        int suara = input.nextInt();
        Latihan test = new Latihan(suara);
        input.nextLine();
        for(int i = 0; i < suara; i++){
            System.out.println("Masukkan Nama/Suara ke - "+ (i+1) + " = ");
            test.kandidat[i] = input.nextLine();
        }
        int hasil = test.ModusArray(test.kandidat, 0, suara, 0);
        System.out.println(" Mayoritaas Jumlah Suara adalah : " + test.kandidat[hasil]);
    }
}
