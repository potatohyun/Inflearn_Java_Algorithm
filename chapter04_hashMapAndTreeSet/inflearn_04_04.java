package chapter04_hashMapAndTreeSet;

import java.util.*;

public class inflearn_04_04 {
    public static void main(String[] args) {
        inflearn_04_04 T = new inflearn_04_04();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), t = sc.nextLine();
        System.out.println(T.solution(s, t));
    }

    public int solution(String s, String t) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>(); // t의 맵
        Map<Character, Integer> map2 = new HashMap<>(); // s의 맵
        for (char tt : t.toCharArray()) map.put(tt, map.getOrDefault(tt,0)+1);
        int lt = 0;
        for (int rt=0;rt<s.length();rt++){
            map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt),0)+1);
            if (rt >= t.length()-1){
                boolean f = false;
                for (char m :map2.keySet()){
                    if (map.get(m) != map2.get(m)) {
                        f = true;
                        break;
                    }
                }
                if (!f) answer++;
                if (map2.get(s.charAt(lt))==1) map2.remove(s.charAt(lt));
                else map2.put(s.charAt(lt),map2.get(s.charAt(lt))-1);
                lt++;
            }
        }
        return answer;
    }

    public int lectureSolution(String a, String b) {
        // 풀이는 동일. 기준이 되는 map에 대해서는 따로 먼저 처리함. 그리고 map은 equals로 비교 가능. for문 돌릴 필요가 없다.
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x: b.toCharArray()) bm.put(x, bm.getOrDefault(x,0)+1);
        int L = b.length()-1;
        for (int i=0;i<L;i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if (am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }
}

/*
설명(HashMap, Sliding Window)
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

예시 입력 1
bacaAacba
abc

예시 출력 1
3
 */

