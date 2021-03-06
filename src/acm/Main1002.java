package acm;

import java.util.*;
import java.io.*;

public class Main1002 {
	static ArrayList<Integer> lst = new ArrayList<>(Collections.nCopies(300000, 0));
	static ArrayList<Integer> save = new ArrayList<>();

	static void arith() {
		lst.set(1, 1);
		for (int i = 2; i <= 250000; i++) {
			if (lst.get(i) == 0)
				for (int f = i + i; f <= 250000; f += i) {
					lst.set(f, 1);
				}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arith();
		while (true) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken()), cnt = 0;
			if (a == 0)
				return;
			for (int i = a + 1; i <= 2 * a; i++) {
				if (lst.get(i) == 0)
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}
