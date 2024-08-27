import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map map = new HashMap();
		String word = sc.nextLine();
		
		map.put("A", 3); map.put("B", 3); map.put("C", 3);
		map.put("D", 4); map.put("E", 4); map.put("F", 4);
		map.put("G", 5); map.put("H", 5); map.put("I", 5);
		map.put("J", 6); map.put("K", 6); map.put("L", 6);
		map.put("M", 7); map.put("N", 7); map.put("O", 7);
		map.put("P", 8); map.put("Q", 8); map.put("R", 8); map.put("S", 8);
		map.put("T", 9); map.put("U", 9); map.put("V", 9);
		map.put("W", 10); map.put("X", 10); map.put("Y", 10); map.put("Z", 10);
		
		Integer a = 0;
		for(int i = 0; i < word.length(); i++) {
			String letter = String.valueOf(word.charAt(i));
			if(map.containsKey(letter)) {
				a += (Integer) map.get(letter);
			}
		}
		
		bw.write(String.valueOf(a));
		bw.flush();
		bw.close();
		
	}
}