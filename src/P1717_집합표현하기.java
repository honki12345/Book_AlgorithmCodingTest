import java.util.Scanner;

// 주의사항
// 1. union함수, 바로 연결하는게 아니라 대표노드 찾아서 연결
// 2. find함수, 재귀에서 빠져나오면서 해당 노드값 업데이트

public class P1717_집합표현하기 {
	static int[] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		parent = new int[n+1];
		for(int i = 0; i < n+1; i++) {
			parent[i] = i;
		}
		for(int i = 0; i < m; i++) {
			int question = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(question == 0) { // union연산
				union(a, b);
			} else { // 두 원소 같은지 확인
				boolean result = checkSame(a, b);
				if (result) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

	private static void union(int a, int b) {
		// 1. 대표노드를 찾는다. 2. 연결한다
		a = find(a);
		b = find(b);
		if (a == b) {
			return;
		} else {
			parent[b] = a;
		}
		
	}

	private static int find(int a) {
		if (a == parent[a]) {
			return a;
		} else {
			// return = find(parent[a]); 와
			// return = parent[a] = find(parent[a]); 의 차이점
			return parent[a] = find(parent[a]); // value를 index로 바꿔서 찾아보기
		}
	}
	
	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);
		if (a == b) return true;
		return false;
	}

}
