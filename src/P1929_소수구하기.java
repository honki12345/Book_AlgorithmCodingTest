import java.util.Scanner;

public class P1929_소수구하기 {

	public static void main(String[] args) {
		// 1. 데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int[] arr = new int[end + 1];
		
		for(int i = 1; i < end + 1; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i <= Math.sqrt(end); i++) {
			if(arr[i] == 0) {
				continue;
			}
			
			for (int j = i + i; j <= end; j += i) {
				arr[j] = 0;
			}
		}
		
		for(int i = start; i <= end; i++) {
			if (arr[i] != 0) System.out.println(i);
		}
	}

}
