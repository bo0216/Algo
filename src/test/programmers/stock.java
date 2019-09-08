package test.programmers;
import java.util.*;

public class stock {
    static public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count;
        
        for(int i=0; i<prices.length; i++) {
        	count = 0;
        	for(int j=i+1; j<prices.length; j++) {
        		if(prices[j]>=prices[i]) {
        			answer[i]= ++count;
        		}
        		else {
        			answer[i]= ++count;
        			break;
        			
        		}
        	}
        }
        
        
        return answer;
        
    }
	public static void main(String[] args) {
		int[] prices = {3,1,3,2,3};
		int[] a = solution(prices);
		for(int temp : a) {
			System.out.println(temp);
		
		
		
	}
}
}