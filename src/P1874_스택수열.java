import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {

	public static void main(String[] args) {

		// 1. 데이터 저장하기
		// n(수열의 갯수), a[](수열), num(오름차순자연수), tmp(수열 값)
		// bf(+,-값 저장)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		
		
		int num = 1;
		boolean result = true;
		for (int i = 0; i < a.length; i++) {
			int tmp = a[i];
			if (tmp >= num) {
				while (tmp >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else { 
				int m = stack.pop();
				if (m > tmp) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					// tmp가 num보다 클 수 없으므로 (윗 분기문)
					// tmp는 m보다 클 수 없다. 
					// 이 분기에는 그 점이 명시되지 않아 읽기 불편하다
					bf.append("-\n");
				}
			}
		}
		if (result) System.out.println(bf.toString());

	}

}
