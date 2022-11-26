package recursive_tree_graph_dfs_bfs.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 중위순회로 구현.
public class 이진트리_순회_5 {
    public Node root;

    public static void dfs(Node root) {
        if(root == null) return;
        else {
            dfs(root.lt);
            System.out.print(root.data+ " ");
            dfs(root.rt);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        이진트리_순회_5 main = new 이진트리_순회_5();
        main.root = new Node(1);
        main.root.lt = new Node(2);
        main.root.rt = new Node(3);
        main.root.lt.lt = new Node(4);
        main.root.lt.rt = new Node(5);
        main.root.rt.lt = new Node(6);
        main.root.rt.rt = new Node(7);
        dfs(main.root);
    }
}

