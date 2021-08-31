package WeeklyChallenges.Week4;

import java.util.Arrays;

public class Other_Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int score = -1;

        for(String str : table) {
            String[] t = str.split(" ");
            String tname = t[0];
            int tscore = 0;
            for(int i=0; i<languages.length; i++) {
                int idx = Arrays.asList(t).indexOf(languages[i]);
                if(idx>-1) tscore += preference[i] * (6-idx);
            }

            if(score == tscore && answer.compareTo(tname) > 0) answer = tname;
            if(score < tscore) {
                score = tscore;
                answer = tname;
            }
        }
        return answer;
    }
}
