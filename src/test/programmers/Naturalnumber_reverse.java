package test.programmers;

public class Naturalnumber_reverse {
	static public int[] solution(long n) {
		  String a = String.valueOf(n);

		  String[] stringAnswer = a.split("");
		  String temp = "0";
		  
		  int[] answer = new int[stringAnswer.length];
		  
		  for(int i=0; i<(stringAnswer.length/2); i++) {
			 temp = stringAnswer[i];
			 stringAnswer[i] = stringAnswer[(stringAnswer.length-1)-i];
			 stringAnswer[(stringAnswer.length-1)-i] = temp; 
		  }
		  for(int i=0; i<stringAnswer.length;i++) {
			  answer[i] = Integer.parseInt(stringAnswer[i]);
			  System.out.println(answer[i]);
		  }	     
		 
	      return answer;	      
	  }

	public static void main(String[] args) {
		long n=123456;
		solution(n);

	}

}
