import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] attend = new int[28];
		int[] rollNumber = new int[30];
		
		for(int i = 0; i < 30; i++) {
			rollNumber[i] = i + 1;
		}
		
		boolean[] exist = new boolean[30];
		for(int i = 0; i < 28; i++) {
			attend[i] = Integer.parseInt(br.readLine());
			exist[attend[i] - 1] = true;
		}
		
		for(int i = 0; i < 30; i++) {
			if(!exist[i]) {
				System.out.println(i + 1);
			}
			
		}
		
	}
}