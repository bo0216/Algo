package test.naver;
import java.util.*;
import java.util.regex.*;

public class email_matches {
	static public int solution(String[] emails) {
        int answer=0;
        String pattern = "^[a-z.]+@[a-z]+\\.+(com||org||net)+$";
	
        for(int i=0; i<emails.length; i++) {
        	
        	if(Pattern.matches(pattern, emails[i])) {
        		answer++;
        	}
        }
      
        return answer;
    }

	public static void main(String[] args) {
		String[] emails = {"d@co@m.com","a@abc.com","b@dedcom","abc@df.net","ab.cd@dv.com"};
		
		System.out.println(solution(emails));
	}
}
