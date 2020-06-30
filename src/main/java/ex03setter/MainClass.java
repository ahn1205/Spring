package ex03setter;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		DatabaseDev d = new DatabaseDev();
//		d.getUrl("jdbc:oracle:thin:@localhost:1512/XEPDB1");
//		d.getUid("spring");
//		d.getUpw("spring");
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("application-context.xml");
		
		DatabaseDev db= ctx.getBean(DatabaseDev.class);
		System.out.println(db.getUid());
		
		
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		dao.info();
		
		
		
	}
}
