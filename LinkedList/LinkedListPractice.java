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

    public void insertAtposition(int data, int position){
        if(position<=0){
            throw new IllegalArgumentException("position must be >=1");
        }

        Node newnode = new Node(data);

        if(position==1){
            newnode.next = Head;
            Head = newnode;
            return;
        }

        Node temp = Head;
        int cnt = 1;

        while(temp!=null && cnt<position-1){
            temp=temp.next;
            cnt++;
        }

        if(temp==null){
            throw new IllegalArgumentException("position out of bounds");
        }

        newnode.next = temp.next;
        temp.next = newnode;

    }
    public void deleteathead(){
        if(Head==null){
            return;
        }
        Head=Head.next;
    }

    public void deleteattail(){
        if(Head==null){
            System.out.println("List is Empty");
            return;
        }
        else if(Head.next==null){
            Head=null;
            return;
        }
        Node curr = Head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }

    public void deleteatposition(int pos){
        if(Head==null){
            System.out.println("List is Empty");
            return;
        }
        else if(pos==1){
            Head=Head.next;
            return;
        }
        Node curr = Head;
        int cnt=1;
        while(cnt<pos-1 && curr.next!=null){
            cnt++;
            curr=curr.next;
        }
        if(curr.next==null){
            System.out.println("Position out of bounds");
            return;
        }
        curr.next=curr.next.next;

    }



}
public class LinkedListPractice {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.insertHead(10);
        ll.insertHead(20);
        ll.insertHead(30);

        ll.insertTail(40);
        ll.insertAtposition(55, 3);

        ll.printallele();

        ll.deleteattail();

        ll.printallele();
    }
}
