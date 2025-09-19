class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node Head;

    public void insertHead(int data){
        Node newnode = new Node(data);
        newnode.next=Head;
        Head=newnode;
    }

    public void printallele(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void insertTail(int data){
        Node newnode = new Node(data);
        if(Head==null){
            Head=newnode;
            return;
        }
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;

    }



}
public class InsertAtHead {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.insertHead(10);
        ll.insertHead(20);
        ll.insertHead(30);

        ll.printallele();

        ll.insertTail(40);

        ll.printallele();
    }
}
