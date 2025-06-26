import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();  // 길이가 n인 문자열
        int m = Integer.parseInt(br.readLine());
        List<Character> characters = new LinkedList<>();
        for(int i = 0; i < str.length(); i++){ // ArrayList에 문자열을 하나씩 넣어줌
            characters.add(str.charAt(i));
        }
        
        ListIterator<Character> curser = characters.listIterator();  // 커서 : 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치
        while(curser.hasNext())
            curser.next();

        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("L")){
                if(curser.hasPrevious())  // 커서가 문장의 맨 앞이 아니면
                    curser.previous();  // 커서를 왼쪽으로 한 칸 옮김
            }else if(command.equals("D")){
                if(curser.hasNext())  // 커서가 문장의 맨 뒤가 아니면
                    curser.next();  // 커서를 오른쪽으로 한 칸 옮김
            }else if(command.equals("B")){
                if(curser.hasPrevious()) {  // 커서가 문장의 맨 앞이 아니면
                    curser.previous();  // 커서는 왼쪽으로 이동한 것 처럼 나타남
                    curser.remove();  // 커서 왼쪽의 문자 삭제
                }
            }else if(command.equals("P")){
                char tmp = st.nextToken().charAt(0); // $라는 문자를 커서 왼쪽에 추가
                curser.add(tmp);  
            }
        }

        for (char c : characters) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}