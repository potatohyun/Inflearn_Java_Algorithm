## 문법
- StringBuilder, StringBuffer
    - 둘 다 String을 다루는 클래스이다.
    - 기존의 String과 다르게 문자열 연산 등으로 기존 객체의 공간이 부족하게 되는 경우,기존의 버퍼 크기를 늘리며 유연하게 동작한다.
    - 그렇다면 뭐가다를까?

    바로 동기화 여부입니다.- StringBuffer는 각 메서드별로 Synchronized Keyword가 존재하여, 멀티스레드 환경에서도 동기화를 지원.- 반면, StringBuilder는 동기화를 보장하지 않음.그렇기때문에 멀티스레드 환경이라면 값 동기화 보장을 위해 StringBuffer를 사용하고,단일스레드 환경이라면 StringBuilder를 사용하는 것이 좋습니다. 단일 스레드환경에서 StringBuffer를 사용한다고 문제가 되는 것은 아니지만, 동기화 관련 처리로 인해 StringBuilder에 비해 성능이 좋지 않습니다.String은 짧은 문자열을 더할 경우 사용합니다.StringBuffer는 스레드에 안전한 프로그램이 필요할 때나, 개발 중인 시스템의 부분이 스레드에 안전한지 모를 경우 사용하면 좋습니다.StringBuilder는 스레드에 안전한지 여부가 전혀 관계 없는 프로그램을 개발할 때 사용하면 좋습니다.사실 JDK 1.5버전 이전에서는 문자열연산(+, concat)을 할때에는 조합된 문자열을 새로운 메모리에 할당하여 참조함으로 인해서 성능상의 이슈가 있었습니다. 그러나 JDK1.5 버전 이후에는 컴파일 단계에서 String 객체를 사용하더라도 StringBuilder로 컴파일 되도록 변경되었습니다. 그리하여 JDK 1.5 이후 버전에서는 String 클래스를 활용해도 StringBuilder와 성능상으로 차이가 없어졌습니다. 하지만 반복 루프를 사용해서 문자열을 더할 때에는 객체를 계속 추가한다는 사실에는 변함이 없습니다. 그러므로 String 클래스를 쓰는 대신, 스레드와 관련이 있으면 StringBuffer를, 스레드 안전 여부와 상관이 없으면 StringBuilder를 사용하는 것을 권장합니다.단순히 성능만 놓고 본다면 연산이 많은 경우, StringBuilder > StringBuffer >>> String 입니다.
출처: https://12bme.tistory.com/42 [길은 가면, 뒤에 있다.:티스토리]

    
    
- StringBuffer나 StringBuilder로 받았을때 초기값설정말고 추후에 설정은 못해주나?

        

## 알고리즘