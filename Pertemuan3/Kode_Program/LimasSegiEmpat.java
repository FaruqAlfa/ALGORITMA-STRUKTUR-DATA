package Pertemuan3.Kode_Program;

public class LimasSegiEmpat {
    public double alas1;
    public double alas2;
    public double tinggi;

    public double hitungLuasPermukaan(){
        return alas1*alas2;
}
    public double hitugVolumeLimas(){
        return  alas1 * alas2 * tinggi * 1/3;
    }
}
