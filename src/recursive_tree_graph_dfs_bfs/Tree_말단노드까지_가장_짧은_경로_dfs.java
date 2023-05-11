package recursive_tree_graph_dfs_bfs;

class Node3 {
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Tree_말단노드까지_가장_짧은_경로_dfs{
    Node3 root;
    public static int dfs(int L, Node3 node) {
        if(node.lt == null && node.rt == null) return L;
        else {
            return Math.min(dfs(L+1, node.lt), dfs(L+1, node.rt));
        }
    }

    public static void main(String args[]) {
        Tree_말단노드까지_가장_짧은_경로_dfs tree = new Tree_말단노드까지_가장_짧은_경로_dfs();
        tree.root=new Node3(1);
        tree.root.lt=new Node3(2);
        tree.root.rt=new Node3(3);
        tree.root.lt.lt=new Node3(4);
        tree.root.lt.rt=new Node3(5);
        System.out.println(dfs(0, tree.root));
    }
}