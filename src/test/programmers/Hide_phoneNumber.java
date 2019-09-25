package test.programmers;

public class Hide_phoneNumber {
	static public String solution(String phone_number) {
	/*	String answer = "";
		
		String data1 = phone_number.substring(0,phone_number.length()-4);
		data1= data1.replaceAll(".","*");
		
		String data2 = phone_number.substring(phone_number.length()-4,phone_number.length());
		
		answer = data1 + data2;
		System.out.print(answer);
		return answer;
	*/
		//간결하게  
		 char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     System.out.println(String.valueOf(ch));
	     return String.valueOf(ch);
		
	}
	public static void main(String[] args) {
		String phone_number = "01033334444";
		solution(phone_number);
	}

}
