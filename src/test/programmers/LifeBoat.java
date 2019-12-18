package test.programmers;
import java.util.*;

public class LifeBoat {
	public static int solution(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		
		int i=0;
		int j=people.length-1;
		
		while(i<j) {
			if(people[i]+people[j]<=limit)	i++;
			j--;
			answer++;
		}
		
		if(i==j) answer++;
		
		return answer;
		}
		
		
	public static void main(String[] args) {
		
		int[] people = {70,50,80,50};
		
		int limit = 100;
		
		System.out.println(solution(people,limit));

	}

}
