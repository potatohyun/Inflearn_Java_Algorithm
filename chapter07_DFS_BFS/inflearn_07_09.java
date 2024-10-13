package chapter07_DFS_BFS;

public class inflearn_07_09 {
    Node root;

    public int DFS(int l, Node root) {
        if (root.lt == null && root.rt==null) return l;
        else return Math.min(DFS(l+1, root.lt), DFS(l+1, root.rt));
    }

    public static void main(String[] args) {
        inflearn_07_09 tree = new inflearn_07_09();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}

/*
설명(tree 말단노드까지의 가장 짧은 경로 (DFS))
아래와 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요
각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(엣지)의 개수를 길이로 하겠다.
      1
    /   \
   2     3
 /   \
4     5
가장 짧은 길이는 3번 노드까지의 길이인 1이다.

입력
첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

출력
점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.

예시 입력 1
5 14

예시 출력 1
3
 */

