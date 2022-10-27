package com.sy.bytefileprocessint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("./" + sdf.format(date) + ".txt", true); 
			//뒤에 true를 붙여주면 실행시킬 때마다 이전에 작성한 내용이 사라지지 않고 이어서 생김
			
			//기록할 메시지 생성
			String msg = "파일에 덮어쓰기";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일 닫기
			fos.close();
			
		} catch(Exception e) {
			System.out.println("파일 기록 실패");
			System.out.println(e.getLocalizedMessage()); //오류 발생 위치와 이유를 정확하게 출력해준다
		}
		
		
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("./2022-10-27.txt");
			
			//읽어서 저장할 바이트 배열을 생성
			byte[] b = new byte[fis.available()];
			
			//읽기
			fis.read(b);
			
			//읽은 내용 확인 - 문자열로 반환
			System.out.println(new String(b));
			//코드값 확인
			System.out.println(Arrays.toString(b));
			
			fis.close();
			
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
