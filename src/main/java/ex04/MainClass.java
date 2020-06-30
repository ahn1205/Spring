package ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//Car, Airplane 빈을 생성하고 , 의존성 주입
		//각 객체안에 있는 베터리를 자바 클래스에서 출력
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		Car c = ctx.getBean(Car.class);
		c.getBattery().energy();
		
	}
}
