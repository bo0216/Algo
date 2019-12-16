package test.programmers;
import java.util.*;

public class FunctionDevelopment {
	
    static public int[] solution(int[] progresses, int[] speeds) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
        int days;
        int before;
        int count = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	days=0;
        	while(progresses[i] < 100) {
        		progresses[i] += speeds[i];
        		days++;
        		
        	}
        	queue.add(days);
        }
        
        before = queue.poll();
        count++;
        
        while(!queue.isEmpty()) {
        	if(before >= queue.peek()) { //꺼내야 되는 수가 전에 것 보다 작을 때, 같을 때  
        		queue.poll();
        		count++;
        		
        	}else {	//꺼내야 되는 수가 전에 것 보다 클 때  
        		list.add(count);
        		before = queue.poll();
        		count = 1;      	
        	
        	}
        }
        
        list.add(count);
        
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        	//System.out.println("answer:"+answer[i]);
        }
      
       
        return answer;
   }
	public static void main(String[] args) {
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5 , 10, 7};
		
		int[] a = solution(progresses,speeds);
		
		System.out.print(a);
		
	}

}
