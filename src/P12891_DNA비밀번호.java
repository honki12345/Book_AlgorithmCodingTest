import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P12891_DNA비밀번호 {
	static int myArr[];
	static int checkArr[];
	static int checkSecret;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 1. 데이터저장
		// S(문자열크기), P(부분 문자열의 크기), A(문자열데이터), checArr(비밀번호체크배열)
		// myArr(현재상태배열), checkSecret(몇개의 문자열이 충족)
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Result = 0;
		char[] A = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		
		// 데이터 받기
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++;
			}
		}
		// 부분문자열 처음 받을 때 저장
		for(int i = 0; i < P; i++) { 
			add(A[i]);
		}
		
		if(checkSecret == 4) Result++;
		
		// 슬라이딩 윈도우
		for (int i = P; i < S; i++) {
			int j = i - P;
			add(A[i]);
			remove(A[j]);
			if(checkSecret == 4) Result++;
		}
		
		System.out.println(Result);
		bf.close();
	}

	private static void remove(char c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
	}

	private static void add(char c) {
		// TODO Auto-generated method stub
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
		
	}

}
