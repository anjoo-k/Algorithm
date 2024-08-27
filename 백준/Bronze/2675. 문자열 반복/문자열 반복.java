import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		sc.nextLine();
		
		int[] r = new int[t];
		String[] s = new String[t];
		for(int i = 0; i < t; i++) {
			r[i] = sc.nextInt();
			s[i] = sc.nextLine().trim();
		}
		
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < s[i].length(); j++) {
				for(int z = 0; z < r[i]; z++) {
					System.out.print(s[i].charAt(j));
				}
			}
			System.out.println();
		}
	}
}