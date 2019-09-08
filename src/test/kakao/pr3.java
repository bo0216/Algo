package test.kakao;
import java.util.*;
import java.io.*;

public class pr3 {
    static public String solution(String p) {
        String answer = "";
        
        
        
        return answer;
    }
    static public String isOk(String input) {
    	
    	char temp;
    	int countA = 0;
    	int countB = 0;
    	
        boolean isVPS = true;
      
        Stack<Character> stack = new Stack<Character>();
        
    	
        for(int i=0; i<input.length(); i++) {
            temp = input.charAt(i);
            if(temp == '(') {
            	countA++;
                // 여는 괄호는 스택에 push하여 담는다.
            	stack.push(temp);
                
            }else if(temp == ')') {
            	countB++;
                // 닫는 괄호가 나온경우 스택의 맨 위의 값이 여는괄호인지 비교한다.
                if(!stack.isEmpty()) {
                    // 스택이 비어있지 않고 맨위값이 여는 괄호라면 스택의 맨 위값을 pop한다. 
                    stack.pop();
                }else {
                    isVPS = false;
                    break;
                }
            }
            
            	
        }
        
        if(countA == countB && isVPS == false) {
        	
        }
        
        if(!stack.isEmpty()) isVPS = false;

        if(isVPS) {
            System.out.println(input);
        }else {
            System.out.println("NO");
        }
    	return input;
    }
   
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // int n = Integer.parseInt(br.readLine());

        
        	int countA=1;
        	int countB=0;
        	
        	String u="";
        	String v="";
       
            boolean isVPS = true;
            String input = br.readLine();
            Stack<Character> stack = new Stack<Character>();
            
            char temp;
            while(countA==countB) {
            	countA = 0;
            	countB = 0;
            	
	            for(int i=0; i<input.length(); i++) {
	                temp = input.charAt(i);
	                if(temp == '(') {
	                	countA++;
	                	u += Character.toString(temp);
	                    // 여는 괄호는 스택에 push하여 담는다.
	                	stack.push(temp);
	                	
	                    
	                }else if(temp == ')') {
	                	countB++;
	                	u += Character.toString(temp);
	                    // 닫는 괄호가 나온경우 스택의 맨 위의 값이 여는괄호인지 비교한다.
	                    if(!stack.isEmpty()) {
	                        // 스택이 비어있지 않고 맨위값이 여는 괄호라면 스택의 맨 위값을 pop한다. 
	                        stack.pop();
	                    }else {
	                        isVPS = false;
	                        break;
	                    }
	                }
	                
	                	
	                }
	            
            }
            
            
            if(!stack.isEmpty()) isVPS = false;
 
            if(isVPS) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            System.out.println(u);
            System.out.println("hi");
    }




}
