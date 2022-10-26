package moonT_day01;

import java.util.Arrays;

import javax.xml.transform.Templates;

public class ArrayTask {

	public static void main(String[] args) {
		
		//문자열 배열생성
		String[] arr = {"카리나", "아이린", "윈터", "조이", "슬기"};
		
		//배열을 순회하면서 출력
		/*
		for(String singer : arr) {
			System.out.println(singer);
		}
		*/
		
		//문자열의 크기 비교하는 메서드: compareTo, compareToIgnorecase
		//System.out.println(arr[1].compareTo(arr[0]));
		
		//선택정렬 - 실무에서는 효율이 떨어지기 때문에 사용하지 않는다
		//1. 배열의 복제
		String[] copyAr = Arrays.copyOf(arr, arr.length);
		
		//선택정렬
		//첫번째 부터 n-1 번째 데이터까지
		for(int i = 0; i < copyAr.length-1; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyAr.length; j++) {
				//뒤에 있는 데이터가 더 크다고 교환
				if(copyAr[i].compareTo(copyAr[j]) < 0) { //부등호만 바꾸면 오름차순, 내림차순 정할 수 있음
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(copyAr));
		
		
		
		//
	}
}
