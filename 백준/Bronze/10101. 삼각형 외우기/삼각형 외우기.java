import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if((a + b + c) == 180 && (a == b || b == c || a == c)) {
			System.out.println("Isosceles");
		} else if((a + b + c) == 180 && (a != b && b != c && a != c)){
			System.out.println("Scalene");
		} else if((a + b + c) != 180) {
			System.out.println("Error");
		}	
	}
}