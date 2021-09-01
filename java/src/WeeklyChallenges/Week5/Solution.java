package WeeklyChallenges.Week5;

import java.util.Arrays;

// 위클리 챌린지 5주차
// 모음 사전
public class Solution {

    public static Float[] d = new Float[3906];

    public static int solution(String word) {
        int answer = 0;
        float tmp = 0;
        int N = word.length();
        for (int i = 0; i < N; i++) {
            float num = 0;
            char ch = word.charAt(i);
            switch (ch) {
                case 'A':
                    num = 1;
                    break;
                case 'E':
                    num = 2;
                    break;
                case 'I':
                    num = 3;
                    break;
                case 'O':
                    num = 4;
                    break;
                case 'U':
                    num = 5;
                    break;
            }

            tmp += num * Math.pow(10,(N-i-1));
            System.out.println(tmp);
        }

        tmp = (float) (tmp / Math.pow(10,N));
        System.out.println(tmp);

        answer = Arrays.asList(d).indexOf(tmp);

        return answer;
    }


    public static void main(String[] args) {

        d[0] = 0f;
        int index = 1;

        for (int i = 1; i < 6; i++) {
            d[index] = i / 10f;
            index++;
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                d[index] = (10 * i + j) / 100f;
                index++;
            }
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                for (int k = 1; k < 6; k++) {
                    d[index] = (100 * i + 10 * j + k) / 1000f;
                    index++;
                }
            }
        }

        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < 6; b++) {
                for (int c = 1; c < 6; c++) {
                    for (int k = 1; k < 6; k++) {
                        d[index] = (1000 * a + 100 * b + 10 * c + k) / 10000f;
                        index++;
                    }
                }
            }
        }

        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < 6; b++) {
                for (int c = 1; c < 6; c++) {
                    for (int k = 1; k < 6; k++) {
                        for (int j = 1; j < 6; j++) {
                            d[index] = (10000 * a + 1000 * b + 100 * c + 10 * k + j) / 100000f;
                            index++;
                        }
                    }
                }
            }
        }

        Arrays.sort(d);


        String word = "AAAE";

        // 6 출력
        System.out.println(solution(word));


    }


}
