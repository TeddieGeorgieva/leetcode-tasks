import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class BFS {
    public static void dfs(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        dfs(node.left);
        dfs(node.right);
    }
    public static void dfsIterative(Node node) {
        Stack<Node> st = new Stack<>();
        if (node != null) {
            st.add(node);
        }
        while (!st.empty()) {
            Node temp = st.pop();
            System.out.println(temp.data);
            if (temp.right != null) {
                st.add(temp.right);
            }
            if (temp.left != null) {
                st.add(temp.left);
            }
        }
    }

    public static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        if (node != null) {
            q.add(node);
        }
        while (!q.isEmpty()) {
             Node temp = q.remove();
             System.out.println(temp.data);
             if(temp.left != null) {
                 q.add(temp.left);
             }
             if(temp.right != null) {
                 q.add(temp.right);
             }
        }
    }

    public static void main(String[] args) {
        Node sixth = new Node(6,null, null);
        Node fifth = new Node(5, null, null);
        Node forth = new Node(4, null, null);
        Node third = new Node(3,sixth, null);
        Node second = new Node(2, forth, fifth);
        Node first = new Node(1, second, third);

        //dfs(first);
        //dfsIterative(first);
        bfs(first);

    } 
}
