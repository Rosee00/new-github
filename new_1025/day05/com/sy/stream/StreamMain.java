package com.sy.stream;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class StreamMain {

	private void maint() {

		//숫자 형태의 문자열 리스트 
		ArrayList<String> list = new ArrayList<>();
		list.add("8");
		list.add("2");
		list.add("3");
		list.add("6");
		list.add("5");
		list.add("9");
		
	//최종 연산을 이용해서 출력
		//ferEach는 매개변수 1 갸를 갖고 이턴이 없는 메서드를 매개변수로 받음
		//Collection의 모든 데이터의 매개변수에 대입하여 내용을 행
		
		//list 안의 데이터를 순차저그로 e 대입해서 {} 안의 내용을 수행	
		//최종 작업만 수행해서 데이터 출력
		list.stream().forEach(e -> {System.out.println(e);});
		
		//데이터 3개만 출력
		list.stream().limit(3).forEach(e -> {
			System.out.println(e);
		});
		
		//데이터 정렬 후 출력
		list.stream().sorted().forEach(e -> {
			System.out.println(e);
		});
		
		//내림차순 정렬
		//sorted 메서의 내림차순 정렬위한 Comparator 인터페이스를 구현한 // 클래스의 객체를 설정하면 됩니다
		//클래스의 객체를 설정하면 됩니다
		//comparator 인터페이스는 매개변수가 2개이고 정수를 리턴하는 메서드 1개만 존재합니다
		/*
		list.stream()
		.sorted(o1, o2) -> o2.compareTo(o1))
		.forEach(e -> {System.out.println(e);});
		*/
		
		//데이터를 정수로 변환해서 정렬
		//중간 처리 메서드 중에는 Int로 리턴해준 mapToInt 라는 메서드가 존재하고 
		//이 메서드를 사용할때는 변환에 사용하는 메서드를 설정만 해주면 됩니다.
		//클래스 이름::메서드 이름
		/*
		int result = list.stream()
				.mapToInt(Integer::parseInt)
				.sum();
		
		System.out.println(result);
		*/
		
		
		
		//홀수의 합
		//filter: 조건에 맞는 데이터만 추출
		//조건에 맞는 추출하고자 할 때는 하나의 매개변수를 받아서 boolean을 리턴하는 
		//람다를 만들어서 대입해주면 됩닌다
		/*
		int result = list.stream()
				.mapToInt(Integer::parseInt)
				.filter(o -> o % 2 == 1)
				.sum(); 
			
		System.out.println(result);
		*/
		
		
		//홀수의 평균
		//일반적으로 생각하기에는 평균의 결과가 정수나 실수가 나와야 하는데
		//자바에서 OptionalDouble이 됩니다.
		//Optional이 붙으면 null을 저장할 수 있는 자료형이 되어 
		//isPresent라는 메서드를 이용해서 null 여부를 판단하고
		//get 이라는 메서드로 데이터를 가져옵니다
		OptionalDouble result = list.stream()
				.mapToInt(Integer::parseInt)
				.filter(o -> o % 2 == 1)
				.average();
		
		if(result.isPresent()) {
			//System.out.println(result.get());
		} else {
			System.out.println("평균 계산 실패 - 아마도 데이터가 없는 것 같음");
		}
		
	}
}
