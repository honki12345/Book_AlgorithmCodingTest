import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1707_이분그래프 {
	static ArrayList<Integer>[] arrList;
	static int[] check;
	static boolean[] visited;
	static boolean isEven; // 이분그래프 여부확인
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for(int t = 0; t < testcase; t++) {
			String[] str = br.readLine().split(" ");
			int nodeNum = Integer.parseInt(str[0]);
			int edgeNum = Integer.parseInt(str[1]);
			arrList = new ArrayList[nodeNum + 1];
			visited = new boolean[nodeNum + 1];
			check = new int[nodeNum + 1];
			isEven = true;
			for(int i = 0; i <= nodeNum; i++) {
				arrList[i] = new ArrayList<>();
			}
			
			// 에지 데이터 저장하기
			for(int i = 0; i < edgeNum; i++) {
				str = br.readLine().split(" ");
				int start = Integer.parseInt(str[0]);
				int end = Integer.parseInt(str[1]);
				//방향이 없으면 양방향경우 다 더해준다.
				arrList[start].add(end);
				arrList[end].add(start);
			}
			
			for(int i = 0; i < nodeNum; i++) {
				if(isEven) {
					dfs(i);
				} else {
					break;
				}
			}
			
			if(isEven) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	private static void dfs(int start) {
		visited[start] = true;
		// 인접리스트 구조이기 때문에 start에서 연결된 모든 노드 탐색을 이와 같이 한다.
		for (int i : arrList[start]) {
			if(!visited[i]) {
				// 바로 직전에 있는 노드와 다른 집합으로 분류를 해준다
				check[i]  = (check[start] + 1) % 2;
				dfs(i);
			}
			else { // 이미 방문한 노드
				if(check[start] == check[i]) {
					isEven = false;
					break;
				}
			}
		}
	}

}
