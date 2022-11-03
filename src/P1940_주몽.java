import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// 1. 데이터 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 2. 재료 배열 저장하기
		for(int i = 0; i < N; i++) {
			A[i]= Integer.parseInt(st.nextToken()); 
		}
		
		// 3. 재료 배열 정렬하기
		Arrays.sort(A);
		int count = 0;
		int i = 0; // A[0] -> MIN 값
		int j = N - 1; // A[N-1] -> MAX
		
		// 4. 투포인터 이동
		while(i < j) {
			if(A[i] +  A[j] < M) i++;
			else if(A[i]+ A[j]> M) j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
	}
}
