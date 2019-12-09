package test.baekjoon;
import java.util.*;

public class no11399_ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		int people = sc.nextInt();
		int[] time = new int[people];
		int min=0;
	
		
		for(int i=0; i<time.length; i++) {
			time[i] = sc.nextInt();			
		}
		
		Arrays.sort(time);
		
		for(int i=0; i<time.length; i++) {
			min+=time[i];
			answer+=min;
			
		}
		
		System.out.println(answer);
		
		
	}

}
