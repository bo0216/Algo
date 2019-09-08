package test.kakao;
import java.util.*;

public class openChatting {
	static public String[] solution(String[] record) {
		HashMap<String,String> map = new HashMap<String, String>();
		String[] splitRecord = {};
		ArrayList<String> answer = new ArrayList<>();
		
        
        for(int i=0; i<record.length;i++){
            splitRecord = record[i].split(" ");
            
            if(splitRecord[0].equals("Enter")){
                map.put(splitRecord[1],splitRecord[2]);
            }
            else if(splitRecord[0].equals("Change")){
                map.put(splitRecord[1],splitRecord[2]);
            }
        }
        
        for(int i=0; i<record.length;i++) {
        	String a;
			splitRecord = record[i].split(" ");
			if(splitRecord[0].equals("Enter")) {
				a = map.get(splitRecord[1])+"님이 들어왔습니다.";
				answer.add(a);
			} 
			else if(splitRecord[0].equals("Leave")){
				a = map.get(splitRecord[1])+"님이 나갔습니다.";
				answer.add(a);

			} 
			
		}

		return answer.toArray(new String[0]);

	}
	
	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi",
						   "Enter uid4567 Prodo",
						   "Leave uid1234",
						   "Enter uid1234 Prodo",
						   "Change uid4567 Ryan"};

		System.out.println(solution(record));
	
}
}
