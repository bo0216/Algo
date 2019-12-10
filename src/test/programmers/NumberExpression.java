package test.programmers;

public class NumberExpression {
	static public int solution(int n) {
		int answer = 1; //자기자신 1개 
		int sum;
		
		for(int i=1; i<n; i++) {
			sum = i;
			for(int j=i+1; j<n; j++) {
				if(sum==n) {
					answer++;
					break;
				}else if(sum>n) {
					break;
				}
				sum += j;
			}
		}
	
		return answer;
  }
	public static void main(String[] args) {
		int n = 15;
		
		int a = solution(n);
		System.out.println(a);
		
	}

}
