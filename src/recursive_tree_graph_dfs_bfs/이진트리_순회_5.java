package recursive_tree_graph_dfs_bfs;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        this.data = val;
        lt=rt=null;
    }
}
public class 이진트리_순회_5 {
    Node root;
    public void DFS(Node root) {
        if(root == null) return;
        else {
            /* 중위순회 */
            // DFS(root.lt);
            // System.out.print(root.data + " ");
            // DFS(root.rt);

            /* 후위순회 */
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        이진트리_순회_5 tree = new 이진트리_순회_5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }


}
