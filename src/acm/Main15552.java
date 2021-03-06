package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main15552 {
static int[] arr = new int[4];
static List lst = new ArrayList();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<4;i++)
			lst.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(lst);
		// list get return type integer
		System.out.println(Math.max((int)lst.get(0)*(int)lst.get(1), (int)lst.get(0)*(int)lst.get(2)));
	}
}
