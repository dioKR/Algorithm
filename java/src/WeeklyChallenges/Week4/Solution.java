package WeeklyChallenges.Week4;

import java.util.Objects;

public class Solution {
    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";

        int N = table.length;
        int L = languages.length;

        int max = 0;

        for(int i=0; i<N; i++) {
            String[] tokens = table[i].split(" ");
            int value = 0;
            for(int j=1; j<tokens.length; j++) {
                //  * (6-j)
                for(int k=0; k<L; k++) {
                    if(Objects.equals(tokens[j], languages[k])) {
                        value += (6-j) * preference[k];
                    }
                }
            }

            if(value > max) {
                answer = tokens[0];
                max = value;
            } else if(value == max) {
                if(answer.compareTo(tokens[0]) > 0) answer = tokens[0];
            }

        }

        return answer;
    }


    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"
        };
        String[] languages = {
//                "PYTHON", "C++", "SQL"
                "JAVA", "JAVASCRIPT"
        };
        int[] preference = {
//                7,5,5
                7,5
        };

        String ans = solution(table, languages, preference);

        // HARDWARE 출력
        System.out.println(ans);
    }
}
