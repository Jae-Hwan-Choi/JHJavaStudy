package _0812mission;

public class _03_2 {

	public static void main(String[] args) {
		// letter  배열은 word문자열 알파벳의 위치이다.
		// letter배열의 암호를 풀어서 편지의 내용을 출력하시오
		
		/* 분석
		 * word 문자열에서 letter 배열의 각 인덱스 숫자만큼 위치한 
		 * 알파벳을 추출하여 특정 문장을 만드는 문제입니다.
		 * 
		 * 진행 
		 * 가. 각 인덱스의 숫자와 word 문자열을 비교하기 위해서는 반복문을
		 * 사용하여 초기값, 조건문, 증가치를 입력합니다. 
		 * 초기값은 특정 데이터가 없으니 i 변수를 넣어 값을 0으로 입력하고, 
		 * 조건문은 배열의 길이를 판단하기 위해 .length 메소드를 사용,
		 * 증가치는 전부 확인이 필요하니 i++로 입력합니다.
		 * 여기서 i는 각 인덱스를 의미하게 됩니다. 
		 * 
		 * 
		 * 나. index의 숫자에 위치한 문자를 추출하기 위해선 .charAt 메소드를 사용합니다
		 * ()안에는 특정 숫자를 입력하지 않고 배열명에 [i]변수를 넣어 순회중 돌아오는
		 * 다음 인덱스의 숫자를 파악해 해당 문자를 출력하게 합니다.  
		 * 
		 *    
		 */
		
		
		String word = "gehoudfkimjnlvy";
		int[] letter={8,12,3,13,1,14,3,4};
		for (int i = 0; i < letter.length; i++) {
			// int index = letter[i];
//			char a = word.charAt(letter[i]);
			System.out.print(word.charAt(letter[i]));
		} 
		}
	}

