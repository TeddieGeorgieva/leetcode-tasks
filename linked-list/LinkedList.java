public class LinkedList {
    int length;
    Node head;
    Node tail;

    LinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {

        Node node = new Node(data, null);
        if (this.length == 0) {
            this.head = this.tail = node;
        } else if (this.length == 1) {
            this.tail = node;
            this.head.next = node;
        } else {
            this.tail = node;
            Node curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            
        }

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    }
}