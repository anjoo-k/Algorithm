import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
            for(int i = 0; i < str.length(); i++) {
        	    if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
        	    	System.out.print(str.toUpperCase().charAt(i));
        	    } else {
            		System.out.print(str.toLowerCase().charAt(i));
        	}
        }
    }
}