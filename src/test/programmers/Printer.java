package test.programmers;

import java.util.*;



public class Printer {
	 static public int solution(int[] priorities, int location) {
        int answer = 0;
        int idx = location;
        boolean check;
        
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i=0; i<priorities.length; i++) {
        	queue.add(priorities[i]);
        	
        }
        
        while(!queue.isEmpty()) {
        	check = false;
        	int a = queue.poll();
	        for(int i=0; i<queue.size(); i++) {
	        	if(a < queue.get(i)) {
	        		check = true;
	        		queue.add(a);
	        		break;
	        	}
	        	
	        }
	        if(check) {
				if(idx == 0) {
					idx = queue.size() - 1;
				}else {
	    			idx--;
				}
	        }
	        else {
	        	answer++;
	        	if(idx == 0) {
	        		break;
		
				} else {
				idx--;
}
	        }
        }
        
        return answer;
	    }
	  

	 public static void main(String[] args) {
		 int[] priorities = {1,1,9,1,1,1};
		 int location = 0;
		 int a = solution(priorities,location);
		 System.out.println(a);
	 }
}
