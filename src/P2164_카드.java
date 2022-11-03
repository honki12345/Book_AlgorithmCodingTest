import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드 {

	public static void main(String[] args) {
		// 1. 데이터 입력하기
		// n(카드의 개수), myQueue(카드 저장)
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();
		
		// 2. 큐에 카드 저장하기
		for(int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		
		while(myQueue.size() > 1) {
			myQueue.poll();
			myQueue.add(myQueue.poll());
		}
		
		System.out.println(myQueue.poll());
	}

}
