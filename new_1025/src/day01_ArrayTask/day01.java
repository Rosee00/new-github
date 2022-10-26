package day01_ArrayTask;

import java.util.Scanner;

public class day01 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		//실수 문자열을 입력받아서 실수로 변경하고 출력하는 프로그램
		System.out.print("실수를 입력하세요:");
		String su = scanner.nextLine();
		
		//실수가 아닌 다른 문자로 입력받았을 때, 문장출력
		try {
		//실수 문자열을 실수로 변경
		Double silsu = Double.parseDouble(su);

		//실수를 문자열로 변환
		String msg = silsu.toString();
		System.out.println(msg);
		}catch(Exception e) {
			System.out.println("변환에 실패");
		}
		scanner.close();
	}
}