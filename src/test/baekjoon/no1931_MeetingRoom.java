package test.baekjoon;
import java.util.*;

public class no1931_MeetingRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		int N = sc.nextInt();

		int[][] room = new int[N][2];
		
		for(int i=0; i<N; i++) {
			room[i][0] = sc.nextInt();
			room[i][1] = sc.nextInt();
		}
		
		//끝나는 시간을 기준으로 오름차준 정렬, 같을 경우에는 **시작 기준으로 정렬 
		Arrays.sort(room, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1,int[] a2) {
				if(a1[1]==a2[1]) {
					return a1[0]-a2[0];
				}else {
					return a1[1]-a2[1];
				}
			}	
		});
		
		int endPoint = 0;
		
		for(int i=0;i<N; i++) {
			if(endPoint <= room[i][0]) {
				answer++;
				endPoint = room[i][1];
			}
		}
		
		System.out.println(answer);
	}
}
