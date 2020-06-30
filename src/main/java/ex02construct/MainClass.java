package ex02construct;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//Hotel 클래스 생성 chef를 확인 .
//		Chef chef = new Chef();
//		Hotel h = new Hotel(chef);
//		h.getChef().cook();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cook();
		
		
	}
}
