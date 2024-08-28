import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] scores = new double[n];
		double maxVal = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		

		for(int i = 0; i < n; i++) {
			if(scores[i] > maxVal) {
				maxVal = scores[i];
			}
		}
		
		double avg = 0;
		for(double a : scores) {
			avg += (a / maxVal * 100);
		}
		
		System.out.println(avg / n);
	}
}