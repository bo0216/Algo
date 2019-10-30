package test.programmers;
import java.util.*;

public class Spy {
	 static public int solution(String[][] clothes) {
	    
	        HashMap<String , Integer> map = new HashMap<String , Integer>();
	     
	        for(int i=0;i<clothes.length;i++) {
	        	if(map.containsKey(clothes[i][1])) {
	        		map.replace(clothes[i][1],map.get(clothes[i][1])+1);
	        	}else 
	        	{
	        		map.put(clothes[i][1],1);
	        	}
	        	
	        	
	        	
	        }
	        
	        int answer = 1;
	        
	        for(int i: map.values()) {
	           answer = answer*(i+1);
	        }
	       
	        return answer-1;
	    }
	 public static void main(String[] args) {
		 String[][] clothes = {{"y","head"},{"b","eye"},{"g","head"}};
		 
		 int a = solution(clothes);
		 
		 System.out.println(a);
		 
		
	 }

}
