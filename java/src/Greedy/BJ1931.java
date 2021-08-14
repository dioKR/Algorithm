package Greedy;

import java.util.*;

class meeting implements  Comparable<meeting>{
    int start;
    int end;

    meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(meeting m) {
        // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야함
        if(end == m.end) {
            return start - m.start;
        }
        return end - m.end;
    }

    @Override
    public String toString() {
        return "(" + start + "," + end + ")";
    }

}

public class BJ1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        ArrayList<meeting> list = new ArrayList<meeting>(n);

        for(int i=0; i<n; i++) {
            int start = sc.nextInt(); int end = sc.nextInt();
            list.add(new meeting(start, end));
        }

        Collections.sort(list);

        int end_time = 0;
        for(int i=0; i<n; i++) {
            meeting m = list.get(i);
            if(end_time <= m.start) {
                end_time = m.end;
                result++;
            }
        }

        System.out.print(result);
    }
}
