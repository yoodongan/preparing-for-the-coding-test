package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 다익스트라_알고리즘 {
    static class Edge implements Comparable<Edge>{
        int vex;
        int cost;
        Edge(int v, int c) {
            this.vex = v;
            this.cost = c;
        }
        @Override
        public int compareTo(Edge e){
            return this.cost - e.cost;
        }
    }
    public static void solution(int n, int m, ArrayList<ArrayList<Edge>> graph) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        int[] dis = new int[n+1];  // 정점 수 만큼 dis 배열 만들기. 1~n 을 담아야 하므로 n+1 의 크기.
        Arrays.fill(dis, Integer.MAX_VALUE);  // dis 배열 최대값으로 초기화.

        pQ.offer(new Edge(1, 0));
        dis[1] = 0;  // 1번 정점 1번 정점은 비용이 당연히 0.

        while(!pQ.isEmpty()) {
            Edge poll = pQ.poll();
            int nowVex = poll.vex;  // Edge 에는 다음 vertex 정보인 vex 가 저장되어 있다.
            int nowCost = poll.cost;  // Edge 에는 다음 vertex 를 가기 위해 필요한 비용 cost 가 저장되어 있다.

            if(nowCost > dis[nowVex]) continue;
            for(Edge e : graph.get(nowVex)) {
                if(dis[e.vex] > nowCost + e.cost) {
                    dis[e.vex] = nowCost + e.cost;
                    pQ.offer(new Edge(e.vex, nowCost + e.cost));
                }
            }
        }
        for (int i = 2; i < dis.length; i++) {
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(n, m, graph);
    }
}
