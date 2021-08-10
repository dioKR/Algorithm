package Greedy;

import java.util.Scanner;

// 거스름돈
public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(mySolution(money));
    }

    // 나의 풀이
    static int mySolution(int money) {
        int[] coin = {500, 100, 50, 10}; // 사용할 거스름돈 정의
        int cnt = 0; // 거스름돈 개수

        for(int i=0; i<coin.length; i++) { // 사용할 거스름돈 종류 만큼 반복
            cnt += money/coin[i]; // 큰 수부터 나누며 거스름돈 개수를 계산
            money = money%coin[i];
        }
        return cnt;
    }

    // 다른 풀이
    static int Solution(int money) {
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for(int i=0; i<coinTypes.length; i++) {
            int coin = coinTypes[i];
            cnt += money/coin;
            money %= coin;
        }
        return cnt;
    }

}

// 그리디 알고리즘의 경우 문제의 해법을 찾았을 때
// 그 해법이 정당한지 검토해야함.

// 위의 문제의 경우 가지고 있는 동전 중에서
// 큰단위가 항상 작은 단위의 배수이므로 작은 단위의 동전들을
// 종합해 다른해가 나올 수 없기 때문