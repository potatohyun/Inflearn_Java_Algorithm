package chapter05_stackAndQueue;

import java.util.*;

public class inflearn_05_08 {
    public static void main(String[] args) {
        inflearn_05_08 T = new inflearn_05_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) lst[i] = sc.nextInt();
        System.out.println(T.solution(n, k, lst));
    }

    class Person{
        int id;
        int priority;
        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int k, int[] lst) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i <lst.length ; i++) {
            q.offer(new Person(i, lst[i]));
        }
        while (!q.isEmpty()){
            Person person = q.poll();
            for (Person p : q){
                if (person.priority < p.priority){
                    q.offer(person);
                    person = null;
                    break;
                }
            }
            if (person!=null){
                answer++;
                if (person.id==k) return answer;
            }
        }
        return answer;
    }

    public int lectureSolution(int n, int k, List<Integer> lst) {
        // 풀이 보고옴. 인덱스때문에 class 생성하는 방법 생각못함. 그리고 비교하는 방법이 있을줄 알았는데 풀이에서는 그냥 for문 돌려서 비교했음..
        int answer = 0;
        return answer;
    }


}

/*
설명 요약
• 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
• 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.

입력
첫 줄에 자연수 N(5<=N<=100)과 M(0<=M<N) 주어집니다.
두 번째 줄에 접수한 순서대로 환자의 위험도(50<=위험도<=100)가 주어집니다.
위험도는 값이 높을 수록 더 위험하다는 뜻입니다. 같은 값의 위험도가 존재할 수 있습니다.

출력
M번째 환자의 몇 번째로 진료받는지 출력하세요.

예시 입력 1
5 2
60 50 70 80 90

예시 출력 1
3

예시 입력 2
6 3
70 60 90 60 60 60

예시 출력 2
4

 */

