package recursive_tree_graph_dfs_bfs.practice;

import java.util.*;

public class Practice {
    public static class Card implements Comparator<String> {
        @Override
        public int compare(String card1, String card2) {
            // 카드 순서를 비교하여 결과를 반환합니다.
            String[] order = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            int card1Index = Arrays.asList(order).indexOf(card1);
            int card2Index = Arrays.asList(order).indexOf(card2);
            return Integer.compare(card1Index, card2Index);
        }
    }

    public static void main(String[] args) {
        String[] card = {"Q", "3", "4", "A"};
        Arrays.sort(card, new Card());
        System.out.println(Arrays.toString(card));

    }
}