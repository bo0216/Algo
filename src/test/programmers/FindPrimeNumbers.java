package test.programmers;
import java.util.*;

public class FindPrimeNumbers {
    public static int solution(int n) {
    	int answer = 0;
    	for(int i=2; i<=n; i++) {
    		boolean isPrime = true;
    		for(int j=2; j*j<=i; j++) {
    			if(i%j ==0){
    				isPrime = false;
    				break;
    			}    		
    		}
    		if(isPrime) {
    			answer++;
    		}
    	}
    	
    	return answer;
    }
	public static void main(String[] args) {
		int n = 10;
		System.out.println("answer:"+solution(n));
	}

}
