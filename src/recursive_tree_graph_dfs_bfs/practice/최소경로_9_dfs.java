package recursive_tree_graph_dfs_bfs.practice;

class Node3 {
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data=val;
        lt=rt=null;
    }
}

public class 최소경로_9_dfs{
    Node3 root;
    public static int level = 0;

    public static int dfs(Node3 node) {
        int min = Integer.MAX_VALUE;
        if(node.lt == null && node.rt == null) {
        }
        else {
            level++;
        }
        return level;
    }

    public static void main(String args[]) {
        최소경로_9_dfs tree = new 최소경로_9_dfs();
        tree.root=new Node3(1);
        tree.root.lt=new Node3(2);
        tree.root.rt=new Node3(3);
        tree.root.lt.lt=new Node3(4);
        tree.root.lt.rt=new Node3(5);
        System.out.println(dfs(tree.root));
    }
}
