package Pertemuan2;

public class LinkedList3 {
    NodeList head;
    NodeList tail;


    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    public void insertFirst(int databaru){
        NodeList nodebaru=new NodeList(databaru);
         if(isEmpty()==true){ //karna menggukanan lingklis kalo di kosong maka di akan menjadi head
             head = nodebaru;
         }else{
             nodebaru.next=head; //
             head=nodebaru;
         }
    }
  public void insertLast(int databaru){ //
        //tambahkan logika pemrograman disini
    nodeBaru = new node2(databaru);
   if(head == null){
       head = nodeBaru;
   }else{
        tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
       tail.next=nodeBaru;
    }
   }
    public void insertAfterHead(int databaru){
        //tambahkan logika pemrograman disini
    }
    public void deleteFirst(){
        NodeList del;

        if (isEmpty()==false){
            del=head;
            head=head.next;
            del=null;
        }
    }
    public void deleteLast(){
        NodeList temp;
        if(head !=null){
            if(head.next==null){
                head = null;
            }
            tail = head;
            temp = head;
            while(tail.next !=null){
                temp = tail;
                tail=tail.next;
            }
            temp.next=null;
            tail=null;
        }
    }
    public void deleteAfterHead(){
        //tambahkan logika pemrograman disini
    }
    public void printAll(){
        NodeList tail;
        if(isEmpty()==false){
            tail=head;
            while(tail !=null){
                System.out.print(tail.data+" ");
                tail = tail.next;
            }
        }else{
            System.out.println("Linked list kosong");
        }
    }
   // ini adalah insertlast yang baru
     public void last2(int databaru){
         NodeList nodebaru = new NodeList(databaru);
         if (isEmpty() == true){
             head = nodebaru;
         }else{
             tail = head;
             while (tail.next != null){
                 tail = tail.next;
             }
             tail.next = nodebaru;
         }
        }

    public void countNode(){
        //tambahkan logika pemrograman disini
    }

    public static void main(String[] args) {
        System.out.println("=================== Operasi Insert Data =================");
        System.out.println("Memebuat Linked list1");
        LinkedList3 list1 = new LinkedList3();
        list1.insertFirst(10);
        list1.insertFirst(20);
        list1.insertFirst(30);
        list1.insertFirst(50);
        list1.printAll();
        //outpunta 50 yang di depan ,

        System.out.println("\nMemebuat linked list2");
        LinkedList3 list2 = new LinkedList3();
        list2.insertLast(10); //deklarasi tail dia akan berpindha pindah sampai dia menukan nilai yang
        list2.insertLast(20);
        list2.insertLast(30);
        list2.insertLast(40);
        list2.printAll();

        System.out.println("\nMembuat linked list3");

        LinkedList3 list3=new LinkedList3();
        list3.insertAfterHead(10);
        list3.insertAfterHead(20);
        list3.insertAfterHead(30);
        list3.insertAfterHead(50);
        list3.printAll();
        list3.countNode();

        System.out.println("================== Operasi Delete Data ===================");
        System.out.println("isi linked list1");
        list1.deleteFirst();
        list1.printAll();

        System.out.println("\nIsi Linked list2");
        list2.deleteLast();
        list2.deleteLast();
        list2.printAll();

        System.out.println("\nIsi Linked List3");
        list3.deleteAfterHead();
        list3.printAll();
    }
}
class NodeList{
    int data;
    NodeList next;

    NodeList(int data){ //CONSTRACTUR
        this.data=data;
        next=null;
    }
}


//data itu lebih mudah di insetr di awal dan di akhir
//