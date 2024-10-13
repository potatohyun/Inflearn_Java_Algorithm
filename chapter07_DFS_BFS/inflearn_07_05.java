package chapter07_DFS_BFS;

public class inflearn_07_05 {
    Node root;

    public void Preorder(Node root) {
        if (root == null) return; // 말단노드
        else {
            System.out.print(root.data + " ");
            Preorder(root.lt); // 왼쪽먼저 순회하고
            Preorder(root.rt); // 오른쪽 순회
        }
    }

    public void Inorder(Node root) {
        if (root == null) return; // 말단노드
        else {
            Inorder(root.lt);
            System.out.print(root.data + " ");
            Inorder(root.rt);
        }
    }

    public void Postorder(Node root) {
        if (root == null) return; // 말단노드
        else {
            Postorder(root.lt);
            Postorder(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        inflearn_07_05 tree = new inflearn_07_05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        System.out.println("전위순휘(Preorder)");
        tree.Preorder(tree.root);
        System.out.println();
        System.out.println("중위순휘(Inorder)");
        tree.Inorder(tree.root);
        System.out.println();
        System.out.println("후위순휘(Postorder)");
        tree.Postorder(tree.root);
    }
}

/*
설명
이진트리순회 (DFS)

입력
   1
 2   3
4 5 6 7

출력
전위 : 1 2 4 5 3 6 7
중위 : 4 2 5 1 6 3 7
후위 : 4 5 2 6 7 3 1

 */

