package test.programmers;

import java.util.*;

public class TheLargestNumber {
	public static String solution(int[] numbers) {
        String answer = "";
        
        //int형 배열인 numbers를 String형 배열로 변환하기 위해 String형 배열을 선언한다.
        String str_numbers[] = new String[numbers.length];
        
        for(int i=0; i<str_numbers.length; i++) {
        	str_numbers[i] = String.valueOf(numbers[i]);
        }
        
        //String배열을 내림차순으로 정렬,
        //인터페이스 Comparator 를 사용하기 위해 메소드를 재정의한다.
        Arrays.sort(str_numbers, new Comparator<String>() {
        	@Override
        	public int compare(String o1,String o2) {
        		return (o2+o1).compareTo(o1+o2); //내림차순, return (o1+02).compareTo(o1+o2); -> 오름차
        		} 
        });
        
        if(str_numbers[0].startsWith("0")) {
        	answer = "0";
        } else {
        	for(int i=0; i<str_numbers.length; i++) {
        		answer += str_numbers[i];
        	}
        }
       
        return answer;
    }
	public static void main(String[] args) {
		int[] numbers = {34,3,30};
		String s = solution(numbers);
		System.out.println(s);
		
		
	}

}
