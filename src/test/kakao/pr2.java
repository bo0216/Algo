package test.kakao;
import java.util.*;

public class pr2 {
	static public int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];

        for(int i=0; i<queries.length; i++) {
        	queries[i] = queries[i].replace("?", ".");
    		System.out.println(queries[i]);
        	for(int j=0; j<words.length; j++) {
        		if(words[j].matches(queries[i])){
        			answer[i]++;
  
        		}

        	}
        }
      
        return answer;
    }
	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		int[] a;
		a = solution(words,queries);
		for(int i=0; i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
