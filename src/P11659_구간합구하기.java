import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 1. 숫자 개수, 질의 개수 저장하기
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = 
				new StringTokenizer(bufferedReader.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		// 합배열 선언하기_인데스0 사용하지않음
		long[] S = new long[suNo + 1];
		stringTokenizer = 
				new StringTokenizer(bufferedReader.readLine());
		// 합배열 초기화
		for(int i = 1; i <= suNo; i++) {
			S[i]= S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		// 질의범위 받기
		// 구간 합 출력하기
		for (int q = 0; q<quizNo; q++) {
			stringTokenizer = 
					new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i - 1] );
		}

	}

}
