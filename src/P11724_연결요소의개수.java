import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수 {
	static boolean[] visited;
	static ArrayList<Integer>[] arrList;
	public static void main(String[] args) throws IOException {
		// 데이터 입력받기
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visited = new boolean[n + 1]; // 0번 배열을 사용하지 않기위하여
		
		// 그래프 인접리스트 저장
		arrList = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			arrList[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arrList[start].add(end);
			arrList[end].add(start);
		}
		int count = 0;
		
		
		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) { // 방문하지 않은 노드이다.
				count++;
				dfs(i);
			}
		}
		System.out.println(count);
	}
	private static void dfs(int v) {
		// 종료식: 연결노드가 모두 방문한노드이면 종료.
		if (visited[v]) return;
		visited[v] = true;
		for(int i : arrList[v]) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		
	}
}
