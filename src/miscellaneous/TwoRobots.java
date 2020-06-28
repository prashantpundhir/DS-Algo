package miscellaneous;

import java.util.HashMap;
import java.util.Scanner;

public class TwoRobots {

	static HashMap<String, Integer> h;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[][] = new int[n][2];
			int total = 0;
			for (int i = 0; i < n; i++) {
				a[i][0] = sc.nextInt();
				a[i][1] = sc.nextInt();
				total = total + Math.abs(a[i][1] - a[i][0]);
			}

			int robot = a[0][1];
			int robot1 = -1;
			h = new HashMap<String, Integer>();

			total = total + checkmin(a, robot, robot1, 1);
			System.out.println(total);
		}
	}

	public static int checkmin(int a[][], int robot, int robot1, int index) {
		String str = String.valueOf(robot) + ":" + String.valueOf(robot1) + ":" + String.valueOf(index);
		String str1 = String.valueOf(robot1) + ":" + String.valueOf(robot) + ":" + String.valueOf(index);
		if (h.containsKey(str))
			return h.get(str);
		if (h.containsKey(str1))
			return h.get(str1);
		if (index >= a.length)
			return 0;
		int min;
		if (robot1 == -1)
			min = Math.min(Math.abs(robot - a[index][0]) + checkmin(a, a[index][1], -1, index + 1),
					checkmin(a, robot, a[index][1], index + 1));
		else
			min = Math.min(Math.abs(robot - a[index][0]) + checkmin(a, a[index][1], robot1, index + 1),
					Math.abs(robot1 - a[index][0]) + checkmin(a, robot, a[index][1], index + 1));
		h.put(str, min);
		h.put(str1, min);
		return min;
	}
}
