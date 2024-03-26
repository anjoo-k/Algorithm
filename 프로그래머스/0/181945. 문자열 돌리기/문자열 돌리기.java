import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length(); i++) {
        	if(a.length() >= 1 && a.length() <= 10) {
        		System.out.println(a.charAt(i));
        	}
        }
    }
}