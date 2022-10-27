package com.sy.charaterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class SerializableMain {

	public static void main(String[] args) {
		// try() 안에서 인스턴스를 생성해주면 따로 close() 해줄 필요 없음
		try (//인스턴스 단위에 파일 기록할 수 있는 객체를 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));) {
			
			//기록할 인스턴스 생성
			StudentDTO dto1 = new StudentDTO(1, "아담", new Date());
			StudentDTO dto2 = new StudentDTO(2, "강진축구", new Date());
			
			//기록할 인스턴스가 여러 개 이므로 하나의 List로 묶어줍니다
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto1);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);
	
			
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		try(//인스턴스 단위에 파일에 읽어낼 수 있는 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));) {
			
			
			//기록을 할 때 List를 사용했으므로 읽어올 때 List로 읽어와야 합니다
			ArrayList list = (ArrayList)ois.readObject();
			
			for(Object obj : list) {
				System.out.println(obj);
			}
			
		
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
