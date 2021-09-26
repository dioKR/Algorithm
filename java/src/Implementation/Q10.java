package Implementation;

// 자물쇠와 열쇠
public class Q10 {

    public static int[][] key = {{0,0,0},
                                 {1,0,0},
                                 {0,1,1}};

    public static int[][] lock = {{1,1,1},
                                  {1,1,0},
                                  {1,0,1}};
    // 90도 회전 함수
    public static int[][] rotateMatrixBy90Degree(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] result = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                 result[j][n-1-i] = a[i][j];
            }
        }
        return result;
    }

    public static boolean check(int[][] newLock) {
        int lockLength = newLock.length / 3;
        for(int i=lockLength; i<lockLength*2; i++) {
            for(int j=lockLength; j<lockLength*2; j++) {
                if(newLock[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution(int[][] key, int[][] lock) {
        int n = lock.length;
        int m = key.length;

        int[][] newLock = new int[n*3][n*3];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                newLock[i+n][j+n] = lock[i][j];
            }
        }

        for(int rotation = 0; rotation < 4; rotation++) {
            key = rotateMatrixBy90Degree(key);
            for(int x=0; x<n*2; x++) {
                for(int y=0; y<n*2; y++) {
                    for(int i=0; i<m; i++) {
                        for(int j=0; j<m; j++) {
                            newLock[x+i][y+j] += key[i][j];
                        }
                    }
                    if(check(newLock)) return true;
                    for(int i=0; i<m; i++) {
                        for(int j=0; j<m; j++) {
                            newLock[x+i][y+j] -= key[i][j];
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(key, lock)); // true
    }

}
