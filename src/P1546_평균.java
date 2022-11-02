import java.util.Scanner;

public class P1546_평균 {

	public static void main(String[] args) {
		// 1. 변수 N에 과목의 수 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 2. 길이가 N인 배열 A[]에 각 점수저장
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i ++) {
			A[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		
		// 3. 최고점 및 총점 저장하기
		for(int i = 0; i < N; i ++) {
			if(A[i] > max)max = A[i];
			sum = sum + A[i];
		}
		System.out.println(sum * 100.0 / max / N);
	}
}
