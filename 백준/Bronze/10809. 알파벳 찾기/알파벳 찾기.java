import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] num = new int[26];
		for(int i = 0; i < 26; i++) {
//			a = 97
			num[i] = -1;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int index = c - 97;
			
			if(index >= 0 && index < 26 && num[index] == -1) {
				num[index] = i;
			}
	}
		for(int i = 0; i < 26; i++) {
			System.out.print(num[i] + " ");
		}
	}
}