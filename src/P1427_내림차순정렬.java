import java.util.Scanner;

public class P1427_내림차순정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		// 선택정렬_배열에서는 값이 아니라 인덱스를 따라가야한다.
		for(int i = 0; i < str.length(); i++) {
			int max = i;
			for(int j = i + 1; j < str.length(); j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			if (arr[i] < arr[max]) {
				int tmp = arr[max];
				arr[max] = arr[i];
				arr[i] = tmp;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(arr[i]);
		}
	}

}
