import java.util.Scanner;

public class P11720_숫자의합 {
	/*
	 * 1. N값 입력받기
	 * 2. 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
	 * 3. sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
	 * 4. int형 변수 sum 선언하기
	 * 5. for(cNum 길이만큼 반복하기)
	 * {
	 * 		배열의 각 자리값을 정수형으로 변환하기
	 * 		sum에 더하여 누적하기
	 * }
	 * 6. sum 출력하기
	 */
	
	public static void main(String[] args) {
		// N값 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
		String sNum = sc.next();
		
		// sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
		char[] cNum = sNum.toCharArray();
		
		// int형 변수 sum 선언하기
		int sum = 0;
		
		// for(cNum 길이만큼 반복하기)
		for(int i = 0; i < cNum.length; i++) {
			// 배열의 각 자리값을 정수형으로 변환하여 sum에 더하여 누적하기
			sum += cNum[i] - '0'; 
		}
		System.out.println(sum);
	}

}
