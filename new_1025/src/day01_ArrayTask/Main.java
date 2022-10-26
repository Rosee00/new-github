package day01_ArrayTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PersonVO[] persons = {
				new PersonVO(1, "수지", 29), 
				new PersonVO(2, "아이유", 30),
				new PersonVO(3, "카리나", 23),
				new PersonVO(4, "아담", 46)
		};
		//Arrays.sort 메서드는 배열을 대입하면 부등호 또는 comperTo 라는 메서드를 호출해서
		//크기 비교를 한 후 정렬을 수행해 줍니다.
		//Arrays.sort(persons);

		//동적으로 정렬하기
		//1. 이름의 오름차순 2. 이름의 내림차순 3.나이의 오름차순 4.나이의 내림차순
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.이름의 오름차순 2.이름의 내림차순 3.나이의 오름차순 4.나이의 내림차순");
		String menu = scanner.nextLine();
		switch(menu.trim()) {
		case "1":
//			System.out.println("이름의 오름차순>");
			Arrays.sort(persons, new Comparator<PersonVO>(){
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getName().compareTo(o2.getName()); //오름차순
				}
			});
			break;
		
		case "2":
			System.out.println("이름의 내림차순>");
			Arrays.sort(persons, new Comparator<PersonVO>() {

				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
			break;
			
		case "3":
			System.out.println("나이의 오름차순>");
			break;
			
		case "4":
			System.out.println("나이의 내림차순>");
			break;
			
		default:
			System.out.println("메뉴는 1-4번만 선택하세요");
			break;
		}

		//배열의 데이터 출력
		//Arrays.toString 은 배열의 각 요소의 toString을 전부 호출해서
		//하나의 문자열로 리턴하는 메서드입니다.
		System.out.println(Arrays.toString(persons));

		//해시코드 출력: 변경이 절대 불가능
		//System.out.println(System.identityHashCode(persons));


	}
}
