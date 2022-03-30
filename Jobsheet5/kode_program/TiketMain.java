package Jobsheet5.kode_program;

public class TiketMain {
    public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Garuda Air Line", 140000, "Surabaya", "Bali");
        Tiket t2 = new Tiket("Batik Air Line", 130000, "Kalimantan", "Surabaya");
        Tiket t3 = new Tiket("Lion Air", 150000, "Jakarta", "Bali");
        Tiket t4 = new Tiket("Sriwijaya Air", 125000, "Sulawesi", "Nias");

list.tambah(t1);
list.tambah(t2);
list.tambah(t3);
list.tambah(t4);

        System.out.println("Daftar Tiket Sebelum Sorting");
        list.tampilAll();

        System.out.println("Daftar Tiket Setelah sorting BubbleSort");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Daftar Tiket setelah sorting SelectionSort");
        list.selectionSort();
        list.tampilAll();
    }

}
