package Pertemuan2;

public class ArrayObject {
    public static void main(String[] args) {
        Mahasiswa[]arrobj=new Mahasiswa[5];

        arrobj[0]=new Mahasiswa(1,"Ayu");
        arrobj[1]=new Mahasiswa(2,"Budi");
        arrobj[2]=new Mahasiswa(3,"Cici");
        arrobj[3]=new Mahasiswa(4,"Doni");
        arrobj[4]=new Mahasiswa(5,"Eli");

        for (int i =0;i< arrobj.length;i++){
            System.out.println("Elemen index"+i+":"
            +arrobj[i].nim+" "
            +arrobj[i].nama);
        }
    }
}

class Mahasiswa{
    public int nim;
    public String nama;
    Mahasiswa(int nim,String nama){
        this.nim = nim;
        this.nama = nama;
    }
}
