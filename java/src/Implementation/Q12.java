package Implementation;

import java.util.*;

class Node2 implements Comparable<Node2> {
    private int x;
    private int y;
    private int stuff;

    public Node2(int x, int y, int stuff) {
        this.x = x;
        this.y = y;
        this.stuff = stuff;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getStuff() {
        return this.stuff;
    }

    @Override
    public int compareTo(Node2 other) {
        if (this.x == other.x && this.y == other.y) {
            return Integer.compare(this.stuff, other.stuff);
        }
        if (this.x == other.x) {
            return Integer.compare(this.y, other.y);
        }
        return Integer.compare(this.x, other.x);
    }
}

// 기둥과 보 설
public class Q12 {

    public static int n = 5;
    public static int[][] build_frame = { // x,y,a,b
            // 좌표 좌표, 0기둥 1보 , 0삭제 1설치
            {1, 0, 0, 1},
            {1, 1, 1, 1},
            {2, 1, 0, 1},
            {2, 2, 1, 1},
            {5, 0, 0, 1},
            {5, 1, 0, 1},
            {4, 2, 1, 1},
            {3, 2, 1, 1}
    };

    public static boolean possible(ArrayList<ArrayList<Integer>> answer) {
        for (int i = 0; i < answer.size(); i++) {
            int x = answer.get(i).get(0);
            int y = answer.get(i).get(1);
            int stuff = answer.get(i).get(2);
            if (stuff == 0) {
                boolean check = false;
                if (y == 0) check = true;
                for (int j = 0; j < answer.size(); j++) {
                    if (x - 1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)) {
                        check = true;
                    }
                    if (x == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)) {
                        check = true;
                    }
                    if (x == answer.get(j).get(0) && y - 1 == answer.get(j).get(1) && 0 == answer.get(j).get(2)) {
                        check = true;
                    }
                }
                if (!check) return false;
            }
            else if(stuff == 1) {
                boolean check = false;
                boolean left = false;
                boolean right = false;

                for(int j=0; j<answer.size(); j++) {
                    if(x==answer.get(j).get(0) && y-1 == answer.get(j).get(1) && 0 == answer.get(j).get(2)) {
                        check = true;
                    }
                    if(x+1 == answer.get(j).get(0) && y-1 == answer.get(j).get(1) && 0 == answer.get(j).get(2)) {
                        check = true;
                    }
                    if(x-1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)) {
                        left = true;
                    }
                    if(x+1 == answer.get(j).get(0) && y == answer.get(j).get(1) && 1 == answer.get(j).get(2)) {
                        right = true;
                    }
                }
                if(left&&right) check = true;
                if(!check) return false;
            }
        }
        return true;
    }


    public static int[][] solution(int n, int[][] build_frame) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();

        for(int i =0; i<build_frame.length; i++) {
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int stuff = build_frame[i][2];
            int operate = build_frame[i][3];
            if(operate == 0) {
                int index = 0;
                for(int j = 0; j<answer.size(); j++) {
                    if(x== answer.get(j).get(0) && y == answer.get(j).get(1) && stuff == answer.get(j).get(2)) {
                        index = j;
                    }
                }
                ArrayList<Integer> erased = answer.get(index);
                answer.remove(index);
                if(!possible(answer)) {
                    answer.add(erased);
                }
            }
            if(operate == 1) {
                ArrayList<Integer> inserted = new ArrayList<Integer>();
                inserted.add(x);
                inserted.add(y);
                inserted.add(stuff);
                answer.add(inserted);
                if(!possible(answer)) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        ArrayList<Node2> ans = new ArrayList<Node2>();
        for (ArrayList<Integer> integers : answer) {
            ans.add(new Node2(integers.get(0), integers.get(1), integers.get(2)));
        }
        Collections.sort(ans);

        int[][] res = new int[ans.size()][3];
        for(int i=0; i<ans.size(); i++) {
            res[i][0] = ans.get(i).getX();
            res[i][1] = ans.get(i).getY();
            res[i][2] = ans.get(i).getStuff();
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] res = solution(n, build_frame);

        for(int i=0; i<res.length; i++) {
            for(int j=0; j<res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        // result = [[1,0,0],[1,1,1],[2,1,0],[2,2,1],[3,2,1],[4,2,1],[5,0,0],[5,1,0]] 좌표 좌표, 0기둥 1보
    }
}
