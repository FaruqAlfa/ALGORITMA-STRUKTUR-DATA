package Jobsheet5.kode_program;

public class TiketService {
Tiket tiket[] = new Tiket[4];
int idx;

void tambah(Tiket t){
    if (idx < tiket.length){
        tiket[idx] = t;
        idx++;
    }else{
        System.out.println("Data Tiket Sudah Penuh!!");
    }
}
void tampilAll(){
    for (Tiket t : tiket){
        t.tampil();
        System.out.println("-------------------------");
    }
}

void bubbleSort(){
    for(int i = 0; i < tiket.length-1; i++){
        for(int j = 1; j < tiket.length-i; j++){
            if(tiket[j].harga > tiket[j-1].harga){
                Tiket tkt = tiket[j];
                tiket[j] = tiket[j-1];
                tiket [j-1] = tkt;
            }
        }
    }
}
void selectionSort(){
    for(int i = 0; i < tiket.length-1; i++){
        int tktMin = i;
        for(int j = i + 1; j < tiket.length; j++){
            if (tiket[j].harga<tiket[tktMin].harga){
                tktMin = j;
            }
        }
        //swap
        Tiket tkt = tiket[tktMin];
        tiket[tktMin] = tiket[i];
        tiket[i] = tkt;
    }
}
}
