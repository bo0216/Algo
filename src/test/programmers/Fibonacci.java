package test.programmers;

public class Fibonacci {
	static public int solution(int n) {
	      int answer = 0;
	      if(n>2) {
	    	  answer = f(n)%1234567;
	      }
	      return answer;
	}
	
	static public int f(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return f(n-1)+f(n-2);
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		int a = solution(n);
		System.out.println(a);
	}

}
