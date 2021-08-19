package DynamicProgramming;

// 피보나치 함수 소스코드
public class Ex8_1 {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    public static int fibo(int x) {
        if(x == 1 || x == 2) {
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }
}
