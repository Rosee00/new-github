package moonT_day02; //=> 실습: 문자열 배열에서 문자열의 위치 찾기

import java.util.Arrays;

public class ArraysMain {
	
	public static void main(String[] args) {
		
		//문자열 배열 생성
		String[] singers = {"태연", "수영", "써니", "티파니", "유리", "효연", "서현"};
		
		//이분 검색 수행 - sort를 하지 않아서 잘못된 결과가 리턴됨
		int result = Arrays.binarySearch(singers, "태연");
		System.out.println(result);
		
		//데이터 정렬
		Arrays.sort(singers);
		//정렬한 데이터 확인
		System.out.println(Arrays.toString(singers));
		result = Arrays.binarySearch(singers, "태연");
		if(result >= 0) {
			System.out.printf("%s 는 %d 번째 존재\n", "태연", result);
		}else {
			System.out.printf("%s 는 존재하지 않음\n", "태연");
		}
	}

}
