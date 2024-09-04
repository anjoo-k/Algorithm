import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int count = 0;
		int i = 0;

		while (count < 3) {

			String str = br.readLine();

			boolean isInt = false;
			if (str.matches("^(0|[1-9]\\d{0,7})$")) {
				i = Integer.parseInt(str);
				isInt = true;
			}

			if (isInt && count == 0) {
				i = i + 3;
			} else if (isInt && count == 1) {
				i = i + 2;
			} else if (isInt && count == 2) {
				i = i + 1;
			}
			count++;
		}

		if (i % 3 == 0 && i % 5 == 0 && i != 0) {
			sb.append("FizzBuzz");

		} else if (i % 3 == 0 && i % 5 != 0) {
			sb.append("Fizz");

		} else if (i % 3 != 0 && i % 5 == 0) {
			sb.append("Buzz");

		} else if (i % 3 != 0 && i % 5 != 0) {
			sb.append(i);

		} else {
			sb.append("");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}