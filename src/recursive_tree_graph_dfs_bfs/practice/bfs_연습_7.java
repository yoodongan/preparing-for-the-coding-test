package recursive_tree_graph_dfs_bfs.practice;

import java.util.LinkedList;
import java.util.Queue;

public class bfs_연습_7 {
    Node root;

    public static void dfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            System.out.print("level " + level + " : ");
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + " ");
                if(currentNode.lt != null) queue.offer(currentNode.lt);
                if(currentNode.rt != null) queue.offer(currentNode.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        bfs_연습_7 tree = new bfs_연습_7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        dfs(tree.root);

    }
}
class Node {
    public int data;
    public Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
