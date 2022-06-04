package KUIS2;

import JobSheet12.Tugas1.Node;

public class Node_23 {
    Pembeli pembeli;
    Pesanan pesanan;
    Node_23 prev, next;

    Node_23(Node_23 prev, Pembeli pembeli, Pesanan pesanan, Node_23 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }
}
