public class DoublyLinkedList {

    Node head;
    Node tail;
    int length = 0;
    DoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public void add(int n){
        
        
        if (length == 0) {
            Node node = new Node(n, null, null);
            this.head = node;
            this.tail = node;
            
        } else {
            Node node = new Node(n, null, this.tail);
            this.tail.next = node;
            this.tail = node; 

        }
        length++;
        
    }

    public void remove(int n) {
        if (length == 0) {
            return;
        }
        
        Node temp = head;
        while (temp != null) { 
            if (temp.data == n){
                if (temp == head) {
                    head = temp.next;
                } 
                else if (temp == tail) {
                    tail = tail.prev;
                    temp.prev.next = null;
                } else if (temp != tail) {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                length--;
            }
            
            temp = temp.next;
        }
    }
    public void print() {

       Node temp = head;
        while (temp != null) { 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public boolean search(int n) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == n) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        list.remove(2);
        System.out.println();
        list.print();
        System.out.println(list.search(3));


    }
}