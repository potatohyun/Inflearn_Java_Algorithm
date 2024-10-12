package chapter06_sortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class inflearn_06_07 {
//    public static void main(String[] args) {
//        inflearn_06_07 T = new inflearn_06_07();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//        for (int[] i : T.solution(n, arr)) {
//            System.out.println(i[0] + " " + i[1]);
//        }
//    }
//
//    public int[][] solution(int n, int[][] arrs) {
//        // 버블정렬
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arrs[j][0] > arrs[j + 1][0]) {
//                    int[] tmp = arrs[j];
//                    arrs[j] = arrs[j + 1];
//                    arrs[j + 1] = tmp;
//                }
//                if (arrs[j][0] == arrs[j + 1][0] && arrs[j][1] > arrs[j + 1][1]) {
//                    int[] tmp = arrs[j];
//                    arrs[j] = arrs[j + 1];
//                    arrs[j + 1] = tmp;
//                }
//            }
//        }
//        return arrs;
//    }

    // lectureSolution
    public static void main(String[] args) {
        inflearn_06_07 T = new inflearn_06_07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        //음수가 반환되도록 설정하면 됨.
        // this값이 이전의값, 파라미터로 오는게 비교대상. 즉 오름차순 정렬되있을때 this가 작은값, 파라미터가 큰 값으로 해석.
        // 강의 : call한 객체(this)와 매개변수로 들어온 객체를 비교하는데 this, 매개변수 순서로 정렬됨.
        if (this.x == o.x) return this.y - o.y; // 그럼 이게 작은값-큰값이니까 음수가 반환.
        else return this.x - o.x;
    }
}

/*
설명(Compare To)
N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

입력
첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
두 번째 줄부터 N개의 좌표가 x , y 순으로 주어집니다. x, y값은 양수만 입력됩니다.

출력
N개의 좌표를 정렬하여 출력하세요.

예시 입력 1
5
2 7
1 3
1 2
2 5
3 6

예시 출력 1
1 2
1 3
2 5
2 7
3 6

 */

