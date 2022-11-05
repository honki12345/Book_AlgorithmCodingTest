import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2252_줄세우기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}
		int inDegree[] = new int[n+1];
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			arr.get(start).add(end);
			inDegree[end]++;
		}
		
		// 위상정렬 실행
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (inDegree[i] == 0) {
				queue.offer(i);
			}
		}
		while(!queue.isEmpty()) {
			int now = queue.poll();
			System.out.println(now + " ");
			for(int next: arr.get(now)) {
				inDegree[next]--;
				if (inDegree[next] == 0) {
					queue.offer(next);
				}
			}
		}
	}

}
