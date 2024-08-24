package chapter01;

import java.util.*;

public class inflearn_01_12 {
    public static void main(String[] args) {
        inflearn_01_12 T = new inflearn_01_12();
        Scanner sc = new Scanner(System.in);
        int strLen = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        System.out.println(T.solution(strLen, str));
    }

    public String solution(int strLen, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strLen; i++) {
            String sub = str.substring(i * 7, (i + 1) * 7); // java에서 인덱싱 작업은 substring()
            sub = sub.replaceAll("#", "1");
            sub = sub.replaceAll("\\*", "0");
            int num = Integer.parseInt(sub, 2); // 두번째 인자는 변경대상 string이 어떤 진수인지 표기하는거.
            answer.append((char) num);
        }

        return answer.toString();
    }

    public String lectureSolution(int strLen, String str) {
        // 전체적인 풀이는 동일
        // substring의 경우 처리해준뒤, 재정의 하는 방법을 쓸수도 있음. substring(n)처럼 인자가 1개만 오면 그 n부터 끝까지를 뽑아냄
        // 문자열 처리를 한번에 나열할 수 있음.
        // replace와 replaceAll의 차이는 첫번째 인자로 문자(캐릭터)가 오는가, 정규식이 오는가의 차이. replaceAll의 경우 정규식이 오기때문에 ""를 사용해주고 replace는 상관없음.
        String answer = "";
        for (int i = 0; i < strLen; i++) {
            String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }
}


/*
replace(), parseInt(string, 2) 문제
설명

현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
현수가 4개의 문자를 다음과 같이 신호로 보냈다면
#****###**#####**#####**##**
이 신호를 4개의 문자신호로 구분하면
#****## --> 'C'
#**#### --> 'O'
#**#### --> 'O'
#**##** --> 'L'
최종적으로 “COOL"로 해석됩니다.
현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.

입력
첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.

출력
영희가 해석한 문자열을 출력합니다.

예시 입력 1
4
#****###**#####**#####**##**

예시 출력 1
COOL

 */

