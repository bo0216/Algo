package test.programmers;
import java.util.*;

public class WinterCoding1 { 
	static public long solution(long w,long h) {
		long answer = 1;
		
		if(w==1 || h==1) {
			return 0;
		}else {
			long g = GCD(w,h);
			//g*((w/g)+(h/g)-1) = w+h-g;
			answer = w*h - (w+h-g);
			
			return answer;
		}
	}
	
	static public long GCD(long a,long b) { //최대공약수 구하기 
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
	
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		
		System.out.println(solution(w,h));
	}

}
