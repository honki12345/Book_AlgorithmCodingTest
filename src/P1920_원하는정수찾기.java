import java.util.Arrays;
import java.util.Scanner;

public class P1920_원하는정수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			boolean find = false;
			int target = sc.nextInt();
			int start = 0;
			int end = arr.length - 1;
			while(start <= end) {
				int mid_index = (start + end) / 2;
				int mid_value = arr[mid_index];
				if (mid_value > target) {
					end = mid_index - 1;
				} else if (mid_value < target) {
					start = mid_index + 1;
				} else {
					find = true;
					break;
				}
			}
			if (find) System.out.println(1);
			else System.out.println(0);
		}
	}

}
