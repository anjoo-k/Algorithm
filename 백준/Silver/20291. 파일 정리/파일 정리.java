import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
  

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      
      Map<String, Integer> map = new TreeMap<String, Integer>();
      for(int i = 0; i < n; i++) {
          StringTokenizer st = new StringTokenizer(br.readLine(), ".");
          String fileName = st.nextToken();
          String fileExtension = st.nextToken();
          
          map.put(fileExtension, map.getOrDefault(fileExtension, 0) + 1);
      }
      
      Iterator<String> it = map.keySet().iterator();
      while(it.hasNext()) {
          String key = it.next();
          sb.append(key + " ").append(map.get(key)).append("\n");
      }

      bw.write(sb.toString());
      bw.flush();
      bw.close();
      br.close();
   }
}