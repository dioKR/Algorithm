package DFS;

import java.util.Stack;
// 자료구조 Stack 클래스 사용해보기

public class StackTest {
    public static void main(String[] args) {

        // int 형 스택 선언 *Integer
        Stack<Integer> stackInt = new Stack<>();
        stackInt.push(1); // 데이터 추가
        stackInt.push(2);
        stackInt.push(3);
        stackInt.pop(); // 데이터 삭제
        stackInt.push(44);
        System.out.println(stackInt.peek()); // 스택 최상단 데이터 조회
        System.out.println(stackInt.empty()); // 스택 empty 여부 확인
        System.out.println(stackInt.search(44)); // 입력 값 탐색 - return 값 = 인덱스 ( 가장 위가 1 )
        System.out.println(stackInt);

        System.out.println("------------------------");

        // char 형 스택 선언 *String
        Stack<String> stackString = new Stack<>();
        stackString.push("hi");
        stackString.push("h");
        System.out.println(stackString.search("hi"));
        System.out.println(stackString);
        System.out.println(stackString.peek());


    }


}
