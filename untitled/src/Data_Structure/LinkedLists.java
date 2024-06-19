package Data_Structure;
class Node{
    int value;
    Node next;
    Node (int value){
        this.value = value;
    }
}
public class LinkedLists {
    Node head;
    public LinkedLists(){
        head = null;
    }
    public void add (int value){
        if (head == null){
            head = new Node(value);
        }
        else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
