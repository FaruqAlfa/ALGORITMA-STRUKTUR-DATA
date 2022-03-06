package Pertemuan3.Kode_Program;

public class Tabung{

    public double tinggi;
    public double jariJari;

    public double hitungVolumeTabung(){

        return 22/7 * jariJari * jariJari * tinggi;
    }

    public double hitungLuasAlas(){
        return  22/7 * jariJari * jariJari;
    }
}
