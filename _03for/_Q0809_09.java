package _03for;

public class _Q0809_09 {

	public static void main(String[] args) {
		// 이 문제는 응용문제입니다. 할 수 있습니다. 풀어 봅시다~~
		// 변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다. 
		/* 9.  String test = "abcdeabce";  // 선언문(자료형 변수 = 초긱값) 자료형-> 연산자
		 * 									  결론 : 변수는 test
		 * 									  		변수는 문자열의 값
		 * 											초기문자열은 "~~~~";
		 * 											why? 변수 = 자료수집
    		   for(int i=0; i < 9; i ++){
			   char aaa = test.charAt(i);
			   sysout(aaa);
    			} 
    	   위 코드를 분석하여 테스트 문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		*/
		String test="abcdeabce";
		int cnt = 0;
		for(int i=0; i < 9; i ++){
			   char aaa = test.charAt(i);
			   if (aaa == 'a') {
				   cnt++;
			   } 
			  } System.out.println(cnt);
			   

	}
}
