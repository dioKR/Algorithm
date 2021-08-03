package Implementation;

// 입출력 방식
// BufferedReader 와 BufferedWriter
// Scanner 의 경우 읽어온 내용을 파싱한다.
// BufferedReader 는 단순히 읽기만 한다.
// BufferedWriter 는 flush()를 한 후에야 출력 가능
// 그 이전에는 write() 한 것들은 버퍼에 저장만 된다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // String 읽고 쓰기
        // BufferedReader 의 readLine 메서드로 한 줄 읽어오기 (String 만 읽는다)
        // readLine 의 return 값은 String
        String str = br.readLine();
        bw.write(str + "\n"); // 쓰기
        bw.flush();  // flush 를 해줘야 콘솔에 출력됨 , 한번에 쏟아낸다.
        //bw.close();
        //br.close();  사용 후 닫아주기

        // int 읽고 쓰기
        int i = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(i));
        bw.flush();
        bw.close();
        br.close(); // 사용후 한번만 닫아주면 된다.

    }
}
