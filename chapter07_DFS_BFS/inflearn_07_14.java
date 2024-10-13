package chapter07_DFS_BFS;

import java.util.*;

public class inflearn_07_14 {
    static List<List<Integer>> graph;
    static int n, m;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int nv : graph.get(cur)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cur] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        inflearn_07_14 T = new inflearn_07_14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}

/*
설명(그래프 최단거리(BFS))
[강의 사진 참고]
다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.

입력
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

출력
1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요

예시 입력 1
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

예시 출력 1
2 : 3
3 : 1
4 : 1
5 : 2
6 : 2

 */

