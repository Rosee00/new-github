package day03_queue;

//인터페이스
interface Starcraft{
	public void attack();
}


//추상메서드는 오버라이딩 불가능X 오직, interface로 구현이 가능!(상속이 아님)
//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{

	@Override
	public void attack() {
		System.out.println("질럿의 공격");
	}
}

public class AnnoymousMain {

	public static void main(String[] args) {
		//인터페이스를 implements 한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Protoss p = new Protoss();
		p.attack();

		
		//인터페이스를 implements 한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		Starcraft z = new Starcraft () {

			@Override
			public void attack() {
				System.out.println("저그의 공격");

			}
		};
		z.attack(); 
		
		//변수를 만들지 않고 인스턴스만 생성해서 메서드 호출
		new Starcraft() {

			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
		}.attack();
	}



}
