package _04Random;

import java.util.Random;

public class lottorandom {

	public static void main(String[] args) {
		// 랜덤로또 중복없는 코드
		Random r = new Random();
        int[] lonum = new int[6];
        int count = 0;

        for (int i = 0; i < lonum.length; i++) {
            int num = r.nextInt(45) + 1;
            boolean dup = false;

            // 중복 확인
            for (int j = 0; j < count; j++) {
                if (lonum[j] == num) {
                    dup = true;
                    break;
                }
            }

            // 중복이 아니면 배열에 추가, 아니면 다시 추출
            if (!dup) {
                lonum[count] = num;
                count++;
            } else {
                i--; // 중복이 있으면 다시 뽑기 위해 인덱스를 줄임
            }
        }

        // 결과 출력
        for (int num : lonum) {
            System.out.print(num + " ");
        }

	}

}
