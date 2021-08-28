package Greedy.BAEKJOON;

import java.io.*;
import java.util.Scanner;

// 주유소
public class BJ13305_Solution {

    public static long ans;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        long[] d = new long[n - 1];
        long[] price = new long[n];

        String[] dStr = br.readLine().split(" ");
        String[] priceStr = br.readLine().split(" ");

        for (int i = 0; i < n - 1; i++) {
            d[i] = stringToLong(dStr[i]);
        }
        for (int i = 0; i < n; i++) {
            price[i] = stringToLong(priceStr[i]);
        }

        int nowId = 0;
        while(nowId < n) {
            long distSum = 0;
            long nowCost = price[nowId];
            for(nowId++; nowId < n; nowId++) {
                distSum += d[nowId-1];
                if(price[nowId] < nowCost) {
                    break;
                }
            }
            ans += (nowCost * distSum);
        }

        System.out.println(ans);
        br.close();
    }

    public static long stringToLong(String str) {
        return Long.parseLong(str);
    }
}
