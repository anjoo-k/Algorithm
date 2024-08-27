import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 킹1개, 퀸1개, 룩2개, 비숍2개, 나이트2개, 폰8개
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] origin = {1, 1, 2, 2, 2, 8};
		int[] have = new int[6];
		
		for(int i = 0; i < 6; i++) {
			have[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 6; i++) {
			origin[i] -= have[i];
			System.out.print(origin[i] + " ");
		}
		
	}
}