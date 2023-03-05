package recursive_tree_graph_dfs_bfs;

class Node {
    int data;
    Node3 lt, rt;
    public Node(int val) {
        this.data = val;
        lt=rt=null;
    }
}
public class 이진트리_순회_5 {
    Node3 root;
    public void DFS(Node3 root) {
        if(root == null) return;
        else {
            /* 중위순회 */
            // DFS(root.lt);
            // System.out.print(root.data + " ");
            // DFS(root.rt);

            /* 후위순회 */
//            DFS(root.lt);
//            DFS(root.rt);
//            System.out.print(root.data + " ");
            /**
             * 전위 순회
             */
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        이진트리_순회_5 tree = new 이진트리_순회_5();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        tree.root.rt.lt = new Node3(6);
        tree.root.rt.rt = new Node3(7);
        tree.DFS(tree.root);
    }


}
