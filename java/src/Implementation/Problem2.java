package Implementation;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int count = 0;
        int[] dx = {2,  2, 1, -1, -2, -2,  1, -1};
        int[] dy = {-1, 1, 2,  2,  1, -1, -2, -2};

        int[][] map = new int[8][8];
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int x = (int)str.charAt(0) - 96;
        int y = str.charAt(1) - '0';


        for(int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if( 1 <= nx && nx <= 8 && 1 <= ny && ny <= 8) count++;
        }

        System.out.println(count);

    }
}
