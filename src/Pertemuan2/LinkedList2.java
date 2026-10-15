package Pertemuan2;

public class LinkedList2 {
    NodeLL head;

    public boolean isEmpty(){ //jika mau ngecke data ada isi atau enggak
        if(head==null){ //jika linkde lis dalam keadaan kosong
            return true;
        }else{
            return false;
        }
    }
}
//deklarasi class node
class NodeLL{
    int data;
    NodeLL next;

    NodeLL(int data){
        this.data=data;
        next=null;
    }
}
