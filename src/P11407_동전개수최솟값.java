import java.util.Scanner;

public class P11407_동전개수최솟값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		
		// 그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (coin[i] <= k) {
				count += (k / coin[i]);
				k = k % coin[i];
			}
		}
		System.out.println(count);
	}

}
