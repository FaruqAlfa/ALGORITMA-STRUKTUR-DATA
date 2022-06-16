package Jobsheet14;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       /* int pilih, x, y;
        boolean info;
        System.out.println("Berapa Banyak edge : ");
        int edge = sc.nextInt();
        System.out.println("Pilih Jenis Graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.println("Pilih = ");
        pilih = sc.nextInt();
        if (pilih == 1) {
            System.out.println("Anda Menggunakan Directed Graph");
            info = true;
        } else {
            System.out.println("Anda menggunakan Undirected Graph");
            info = false;

        }*/
       Graph graph = new Graph(6);
        graph.addEdge(0, 1, "Surabaya", "Malang");
        graph.addEdge(0, 4, "Surabaya", "Kediri");
        graph.addEdge(1, 2, "Malang", "Kediri");
        graph.addEdge(1, 3, "Malang", "Blitar");
        graph.addEdge(1, 4, "Malang", "Surabaya");
        graph.addEdge(2, 3, "Kediri", "Malang");
        graph.addEdge(3, 4, "Blitar", "Surabaya");
        graph.addEdge(3, 0, "Blitar", "Kediri");
        graph.printGraph();
        graph.degree(2);
        graph.printGraph();

        /*Graph graph = new Graph(edge, info);
        int vertexTotal, x, y;
        System.out.print("Masukkan berapa banyak vertex : ");
        vertexTotal = sc.nextInt();
        System.out.println("Masukkan <source> <destination>");
        int i = 0;
        while (i < edge) {
            x = sc.nextInt();
            y = sc.nextInt();

            graph.addEdge(x, y);
            i++;
        }
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();*/
    }
}