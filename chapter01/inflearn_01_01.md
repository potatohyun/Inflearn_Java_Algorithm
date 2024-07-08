## 문법
- char 입력받기
    ``` 
    char chr = scanner.next().charAt(0);
    ```
    java의 스캐너로는 char만 입력받는거는 불가능. 그래서 문자열을 받은다음 ```charAt(0)```로 char를 가져오는 방식으로 해야한다.

- 대소분자 변환
    - 문자 값이 대문자인지, 소문자인지 확인
        ```
        Character.isUpperCase() // 대문자인지 확인
        Character.isLowerCase() // 소문자인지 확인
        ```
    - 대문자로 변환
        ```
        Character.toUpperCase(char) // 대문자로 변환
        Character.toLowerCase(char) // 소문자로 변환
        ```
        

## 알고리즘