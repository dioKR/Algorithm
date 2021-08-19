package DynamicProgramming;

// 피보나치 수열 소스코드 재귀적
// 메모제이션 사용
public class Ex8_2 {

    static long[] d = new long[100];

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    public static long fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }

        if (d[x] == 0) {
            d[x] = fibo(x - 1) + fibo(x - 2);
        }
        return d[x];

    }

}


