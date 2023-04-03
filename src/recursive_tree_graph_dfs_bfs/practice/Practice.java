package recursive_tree_graph_dfs_bfs.practice;

import java.util.*;

public class Practice {
    public String solution(String[] Dir, String[][] Cmd) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < Dir.length; i++) {
            String tmp = Dir[i];
            String[] sp = tmp.split("/");
            String s = sp[sp.length - 1];
            map.put(tmp, s);

        }
        for (int i = 0; i < Cmd.length; i++) {
            if (Cmd[i][0].equals("CD")) {
                for (String key : map.keySet()) {
                    if(map.get(key).equals(Cmd[i][1])) {
                        answer = key;
                    } else if (Cmd[i][1].contains("C:/root") && Cmd[i][1].equals(key)) {
                        answer = Cmd[i][1];
                    }
                }
            }
        }

        return answer;
    }
}