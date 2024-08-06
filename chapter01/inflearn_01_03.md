## 문법
- BufferedReader
    -  기본 사용법
        ```
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언

        String s = bf.readLine(); // 값 입력
        int i = Integer.parseInt(bf.readLine()); //Int
        ```
        - readLine()의 리턴값은 String이기 때문에 다른타입으로 입력을 받을려면 형변환을 꼭 해야한다.
        - throws IOException로 예외처리를 해줘야 한다
    - Read한 데이터를 공백 단위로 나누기
        1. 차례대로 호출
            ```
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken()); // 호출
            ```
        2. 특정 기준으로 배열 생성
            ```
            String array[] = s.split(" ");
            ```

## 알고리즘