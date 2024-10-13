package chapter07_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class inflearn_07_07 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        int l = 0;
        while (!que.isEmpty()) {
            int len = que.size();
            System.out.print(l + " : ");
            for (int i = 0; i < len; i++) {
                Node current = que.poll();
                System.out.print(current.data + " ");
                if (current.lt != null) que.offer(current.lt);//왼쪽자식 넣어줌
                if (current.rt != null) que.offer(current.rt);//오른쪽자식 넣어줌
            }
            l++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inflearn_07_07 tree = new inflearn_07_07();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}

/*
설명
이진트리 레벨 탐색(BFS)

입력
   1
 2   3
4 5 6 7

출력
1 2 3 4 5 6 7

 */

