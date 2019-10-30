package test.nhn;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<Integer> cardCount = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String temp[] = new String[n];
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			temp[i]= input;
		}
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(temp[i])) {
				map.put(temp[i], map.get(temp[i])+1);
			}else {
				map.put(temp[i], 1);
			}
			
		}
		//System.out.println(map);
		
		
		
		Iterator<String> keySetIterator = map.keySet().iterator();
		while (keySetIterator.hasNext()) {
		    String key = keySetIterator.next();
		    cardCount.add(map.get(key));
		}
		/*for(int i=0;i<cardCount.size();i++) {

			System.out.println(cardCount.get(i));
		}*/
		
		boolean a = false;
		int count = 0;
		for(int i=0;i<cardCount.size()-1;i++) {
			
			if(cardCount.get(i)==cardCount.get(i+1)) {
				if(count ==0 ) {a=true;}
				else {a = false;} 
			}else if(cardCount.get(i)+1 == cardCount.get(i+1)||cardCount.get(i)==cardCount.get(i+1)+1){
				if(count==0) {
				count=1;
				a=true;}else{
							a=false;}
				
			}
			else {
				break;
			}
	
		}
		int sum=0;
		for(int i=0;i<cardCount.size();i++) {
			sum += cardCount.get(i);
			
		}
		if(a) {
			if(count ==1) {
				System.out.println("Y"); 
				System.out.println(sum+1);
				System.out.println(cardCount.size());	
			}else {
			System.out.println("Y"); //종류가 개수별로 동일함  
			System.out.println(sum);
			System.out.println(cardCount.size());
			}

		}else {
			System.out.println("N");
			System.out.println(sum);
			System.out.println(cardCount.size());
			
		}
		
		

		
	

	
	}

}
