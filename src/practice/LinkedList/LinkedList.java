package practice.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LL{
    Node head;
    Node tail;

    LL(){
        this.head = null;
        this.tail = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.print("Linked list is empty");
        }
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data);

            if(temp.next != null){
                System.out.print(" -> ");
            }

            temp = temp.next;
        }
        System.out.println();
    }

    public int length(){
        int length = 0;

        if(head == null){
            return 0;
        }

        Node temp = head;
        while(temp != null){
            length ++;

            temp = temp.next;
        }

        return length;
    }

}

public class LinkedList {
    public static void main(String[] args){
        LL list = new LL();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        list.printList();
        System.out.printf("length of linked list is %d", list.length());
    }
}
