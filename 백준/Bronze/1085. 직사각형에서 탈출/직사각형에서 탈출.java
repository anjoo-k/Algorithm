import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt(); // 0 0  0 w  h 0  w h
		int h = sc.nextInt();
		
		int a = Math.min(x, h - y);
		int b = Math.min(y, w - x);
		
		System.out.println(Math.min(a, b));
	}
}