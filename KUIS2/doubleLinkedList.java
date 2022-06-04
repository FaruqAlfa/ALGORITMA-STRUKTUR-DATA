package KUIS2;


import JobSheet12.Node;

public class doubleLinkedList {
    Node_23 head;
    int size;

    public doubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFrist(Pembeli pb, Pesanan ps) {
        if (isEmpty()) {
            head = new Node_23(null, pb, ps, null);
        } else {
            Node_23 newNode = new Node_23(null, pb, ps, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli pb, Pesanan ps) {
        if (isEmpty()) {
            addFrist(pb, ps);
        } else {
            Node_23 current = head;
            while (current.next != null) {
                current = current.next;

            }
            Node_23 newNode = new Node_23(current, pb, ps, null);
            current.next = newNode;
        }
        size++;
    }
    public void print(){
        if (!isEmpty()) {
            Node_23 tmp = head;
            while(tmp != null){

                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Antrian Kosong !");
        }
    }

    public void removeFrist() throws Exception{
        if (isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
           head = null;
            System.out.println(head.pembeli.namaPembeli + "Telah memesan menu");
        }else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
