package WeeklyChallenges.Week5;

public class Best_Solution {
    public int solution(String word) {
        int answer = 0;
        int per = 3905;

        for(String s : word.split("")) {
            answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        }

        System.out.println("AEIOU".indexOf("A"));

        return answer;

    }

    public static void main(String[] args) {
        System.out.println("AEIOU".indexOf("E"));
    }
}
