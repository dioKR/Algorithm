package Implementation.Q;

import java.util.ArrayList;
import java.util.Scanner;


class Combination {
    private int n;
    private int r;
    private int[] now;
    private ArrayList<ArrayList<Position2>> result;

    public ArrayList<ArrayList<Position2>> getResult() {
        return result;
    }

    public Combination(int n, int r) {
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.result = new ArrayList<ArrayList<Position2>>();
    }

    public void combination(ArrayList<Position2> arr, int depth, int index, int target) {
        if(depth == r) {
            ArrayList<Position2> temp = new ArrayList<>();
            for (int j : now) {
                temp.add(arr.get(j));
            }
            result.add(temp);
            return;
        }
        if(target == n) return;
        now[index] = target;
        combination(arr, depth+1, index+1, target+1);
        combination(arr, depth, index, target + 1);
    }

}


class Position2 {
    private int x;
    private int y;

    public Position2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }
}


// 치킨배달
public class Q13 {
    public static int n,m;
    public static int[][] arr = new int[50][50];
    public static ArrayList<Position2> chicken = new ArrayList<>();
    public static ArrayList<Position2> house = new ArrayList<>();

    public static int getSum(ArrayList<Position2> candidates) {
        int result = 0;

        for (Position2 position2 : house) {
            int hx = position2.getX();
            int hy = position2.getY();

            int temp = (int) 1e9;
            for (Position2 candidate : candidates) {
                int cx = candidate.getX();
                int cy = candidate.getY();
                temp = Math.min(temp, Math.abs(hx - cx) + Math.abs(hy - cy));
            }
            result += temp;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                arr[r][c] = sc.nextInt();
                if(arr[r][c]==1) house.add(new Position2(r,c));
                else if(arr[r][c] == 2) chicken.add(new Position2(r,c));
            }
        }

        Combination comb = new Combination(chicken.size(), m);
        comb.combination(chicken, 0,0,0);
        ArrayList<ArrayList<Position2>> chickenList = comb.getResult();

        int result = (int)1e9;
        for(int i=0; i<chickenList.size(); i++) {
            result = Math.min(result, getSum(chickenList.get(i)));
        }
        System.out.println(result);


    }
}
