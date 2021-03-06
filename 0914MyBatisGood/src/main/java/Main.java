import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.mybatis.dao.PhonecaseDao;
import com.mybatis.domain.Phonecase;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");

		
		PhonecaseDao dao = context.getBean(PhonecaseDao.class);
		
		Phonecase a = new Phonecase();
		a.setCode(6);
		a.setName("토토");
		a.setPrice(12000);
		a.setDes("귀엽다.");
		dao.insertGood(a);
		
		//System.out.println(dao.list());
		List<Phonecase> list = dao.list();
		for(Phonecase imsi : list) {
			System.out.println(imsi);
		}
		context.close();
				

	}

}
