import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  
    private static int[] acgt = new int[4]; 
    private static int[] count = new int[4];
    
    public static boolean isValid() {
        for (int i = 0; i < 4; i++) {
            if (count[i] < acgt[i]) return false;
        }
        return true;
    }
   
   public static int getIndex(char dnaCheck) {
       if(dnaCheck == 'A')
           return 0;
       else if(dnaCheck == 'C')
           return 1;
       else if(dnaCheck == 'G')
           return 2;
       return 3; // T
   }

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      StringTokenizer st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken()); // 임의로 만든 DNA 문자열 길이
      int p = Integer.parseInt(st.nextToken()); // 비밀번호로 사용할 부분문자열 길이
      String dna = br.readLine(); // 입력받은 DNA 문자열
      char[] dnaArr = dna.toCharArray();
      
      st = new StringTokenizer(br.readLine()); // 부분문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수 입력 받음
      // A, C, G, T 의 최소 갯수 : 조건 넣어둠
      for(int i = 0; i < 4; i++) {
         acgt[i] = Integer.parseInt(st.nextToken());
      }
      
      // 슬라이딩 윈도우에서 최초값
      for(int i = 0; i < p; i++) {
          count[getIndex(dnaArr[i])]++;
      }
      
      int result = 0;
      if (isValid()) result++;
      for(int i = p; i < s; i++) {
          count[getIndex(dnaArr[i])]++;
          count[getIndex(dnaArr[i - p])]--;
          if(isValid()) result++;
      }
      
      bw.write(String.valueOf(result));
      bw.flush();
      bw.close();
      br.close();
   }
}