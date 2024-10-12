package chapter06_sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class inflearn_06_09 {
    public static void main(String[] args) {
        inflearn_06_09 T = new inflearn_06_09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        //
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // 간단하게 최대값을 구해주는 것.
        int rt = Arrays.stream(arr).sum();
        while (lt <=rt){
            int mid = (lt+rt)/2;
            if (count(arr,mid)<=m){
                answer = mid;
                rt = mid-1;
            }else lt = mid+1;
        }
        return answer;
    }
    public int count(int[] arr, int capacity) {
        int cnt = 1; // DVD 장 수. 무조건 1장은 필요하니까
        int sum = 0; // 현재 DVD에 녹음되고 있는 용량
        for (int x : arr){
            if ((sum+x)>capacity) {
                cnt++;
                sum = x;
            }
            else sum+=x;
        }
        return cnt;
    }

}

/*
설명(결정알고리즘)
본문참고

입력
첫째 줄에 자연수 N(1≤N≤1,000), M(1≤M≤N)이 주어진다.
다음 줄에는 조영필이 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로(자연수) 주어진다.
부른 곡의 길이는 10,000분을 넘지 않는다고 가정하자.

출력
첫 번째 줄부터 DVD의 최소 용량 크기를 출력하세요.

예시 입력 1
9 3
1 2 3 4 5 6 7 8 9

예시 출력 1
17

 */

