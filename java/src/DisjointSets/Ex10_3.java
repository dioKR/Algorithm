package DisjointSets;

import java.util.Scanner;

// 서로소 집합을 이용한 사이클 판별 소스코드
public class Ex10_3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cycle = false;
        Ex10_2.v = sc.nextInt();
        Ex10_2.e = sc.nextInt();

        for (int i = 1; i < Ex10_2.v + 1; i++) {
            Ex10_2.parent[i] = i;
        }

        for (int i = 0; i < Ex10_2.e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (Ex10_2.findParent(a) == Ex10_2.findParent(b)) {
                cycle = true;
                break;
            } else {
                Ex10_2.unionParent(a, b);
            }
        }

        if(cycle) System.out.println("사이클이 발생하였습니다.");
        else System.out.println("사이클이 발생하지 않았습니다.");

    }

}
