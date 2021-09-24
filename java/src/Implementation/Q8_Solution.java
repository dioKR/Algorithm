package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q8_Solution {

    public static String str;
    public static ArrayList<Character> result = new ArrayList<Character>();
    public static int value = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        for(int i=0; i<str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                result.add(str.charAt(i));
            }
            else {
                value += str.charAt(i) - '0';
            }
        }

        Collections.sort(result);

        for (Character character : result) {
            System.out.print(character);
        }

        if(value != 0) System.out.print(value);
        System.out.println();
        

    }

}
