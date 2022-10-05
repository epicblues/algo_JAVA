package com.baek_algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Problem_15683 {

	static int[][] table;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		var st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		table = new int[n][m];
		var cctvs = new HashMap<Integer, List<Point>>();
		for (int i = 1; i <= 5; i++) {
			cctvs.put(i, new ArrayList<>());
		}
		for (int i = 0; i < n; i++) {
			var line = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				var num = Integer.parseInt(line[j]);
				if (cctvs.containsKey(num)) {
					cctvs.get(num).add(new Point(i, j));
				}
				table[i][j] = num;
			}
		}

		// 백트래킹으로 방향을 다 정해 놓고 하나씩 계산한다.

		// 5 계산
		var list = cctvs.get(5);
		for (Point p : list) {
			populateLeft(p);
			populateRight(p);
			populateTop(p);
			populateBottom(p);
		}

		// 4 계산
		// 가장 best choice를 가진 사람이 나타날 경우 답의 순서쌍을 바꾼다.
		// 방향 : 0,1,2,3(상 우 하 좌)
		// 4 개의 직선을 다 계산하고 어떤 것을 포기할 것인가.

		list = cctvs.get(4);
		for (Point p : list) {
		}

		// 3 계산

		// 2 계산

		// 1 계산

		// '새로운 #'을 얼마나 많이 만드는가가 중요하다.
		// 가장 범위가 넓은 cctv부터 정하고 가자.

	}

	private static int calculateBottom(Point p) {
		// x축 기준 채우기
		var x = p.x;
		var y = p.y;
		var count = 0;
		for (int i = x + 1; i < table.length; i++) {
			var target = table[i][y];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				count++;
			}

		}

		return count;
	}

	private static int calculateTop(Point p) {
		var x = p.x;
		var y = p.y;
		var count = 0;
		for (int i = x - 1; i >= 0; i--) {
			var target = table[i][y];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				count++;
			}

		}
		return count;
	}

	private static int calculateRight(Point p) {
		var x = p.x;
		var y = p.y;
		var count = 0;
		for (int i = y + 1; i < table[0].length; i++) {
			var target = table[x][i];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				count++;
			}

		}
		return count;
	}

	private static int calculateLeft(Point p) {
		var x = p.x;
		var y = p.y;
		var count = 0;
		for (int i = y - 1; i >= 0; i--) {
			var target = table[x][i];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				count++;
			}

		}
		return count;
	}

	private static void populateBottom(Point p) {
		// x축 기준 채우기
		var x = p.x;
		var y = p.y;
		for (int i = x + 1; i < table.length; i++) {
			var target = table[i][y];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				table[i][y] = -1;
			}

		}
	}

	private static void populateTop(Point p) {
		var x = p.x;
		var y = p.y;
		for (int i = x - 1; i >= 0; i--) {
			var target = table[i][y];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				table[i][y] = -1;
			}

		}

	}

	private static void populateRight(Point p) {
		var x = p.x;
		var y = p.y;
		for (int i = y + 1; i < table[0].length; i++) {
			var target = table[x][i];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				table[i][y] = -1;
			}

		}

	}

	private static void populateLeft(Point p) {
		var x = p.x;
		var y = p.y;
		for (int i = y - 1; i >= 0; i--) {
			var target = table[x][i];
			if (target == 6) {
				break;
			}
			if (target == 0) {
				table[i][y] = -1;
			}

		}

	}

	static void populate(int x, int y) {
		if (table[x][y] == 0) {
			table[x][y] = Integer.MAX_VALUE;
		}
	}

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
