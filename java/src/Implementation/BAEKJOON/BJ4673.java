package Implementation.BAEKJOON;

// 셀프넘버
public class BJ4673 {
    public static boolean[] d = new boolean[10001];

    public static int funtionD(int x) {
        int result = x;
        while(true) {
            result += (x%10);
            if(x/10 == 0) break;
            else x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {

        for(int i=1; i<=10000; i++) {
            int tmp = funtionD(i);
            if(tmp <= 10000) {
                d[tmp] = true;
            }
        }

        for(int i=1; i<=10000; i++) {
            if(!d[i]) {
                System.out.println(i);
            }
        }

    }
}
