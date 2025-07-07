import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();
        char[] ch = word.toCharArray();
        
        // 아스키 48~57이 숫자
        for(int i = 0; i < n; i++) {
            if(ch[i] >= 48 && ch[i] <=57)
                sb.append(ch[i]);
            else
                sb.append(" ");
        }
        
        String[] split = sb.toString().trim().split("\\s+");
        
        long result = 0;
        for (String s : split) {
            if (!s.isEmpty()) {
                result += Long.parseLong(s);
            }
        }
        
        System.out.println(result);

        br.close();
    }
}