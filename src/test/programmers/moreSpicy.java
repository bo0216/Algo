package test.programmers;

import java.util.*;

public class moreSpicy {

	static public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> PQ = new PriorityQueue<>();

		for (int i = 0; i < scoville.length; i++) {
			PQ.add(scoville[i]);

		}

		int newScoville = 0;
		while (PQ.peek() < K) {

			int a = PQ.poll();
			int b = PQ.poll();

			newScoville = a + (b * 2);
			PQ.add(newScoville);

			if (PQ.size() == 1) {
				if (PQ.peek() < K)
					return -1;
			}

			answer++;

		}

		return answer;
	}

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 7;
		int a = solution(scoville, k);

		System.out.println(a);

	}

}
