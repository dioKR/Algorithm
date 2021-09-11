package Implementation.BAEKJOON;


import java.util.Scanner;

public class BJ2941 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int result = 0;

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) == 'c') {
                if(i+1 < str.length()) {
                    if(str.charAt(i+1) == '=') {
                        i = i+1;
                    } else if(str.charAt(i+1) == '-') {
                        i = i+1;
                    }
                }
            }
            else if(str.charAt(i) == 'd') {
                if(i+1 < str.length()) {
                    if(str.charAt(i+1) == '-') {
                        i = i+1;
                    } else if(str.charAt(i+1) == 'z') {
                        if(i+2 < str.length()) {
                            if(str.charAt(i+2) == '=') {
                                i = i+2;
                            }
                        }
                    }
                }
            }
            else if(str.charAt(i) == 'l') {
                if(i+1 < str.length()) {
                    if(str.charAt(i+1) == 'j') {
                        i = i+1;
                    }
                }
            }
            else if (str.charAt(i) == 'n') {
                if(i+1 < str.length()) {
                    if(str.charAt(i+1) == 'j') {
                        i = i+1;
                    }
                }
            }
            else if(str.charAt(i) == 's') {
                if(i+1 < str.length()) {
                    if(str.charAt(i+1) == '=') {
                        i = i+1;
                    }
                }
            }
            else if(str.charAt(i) == 'z') {
                if(i+1 < str.length()) {
                    if(str.charAt(i+1) == '=') {
                        i = i+1;
                    }
                }
            }
            result++;


        }
        System.out.println(result);

    }
}