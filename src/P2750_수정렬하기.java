import java.util.Scanner;

public class P2750_수정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 데이터저장: n(데이터갯수), arr(배열)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//버블정렬 구현
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		
		// 배열 출력
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
