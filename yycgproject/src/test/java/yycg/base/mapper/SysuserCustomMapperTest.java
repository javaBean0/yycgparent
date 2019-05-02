package yycg.base.mapper;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yycg.base.domain.Sysuser;

public class SysuserCustomMapperTest extends TestCase {

	private ApplicationContext applicationContext;

	protected void setUp() throws Exception {
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(
		        "classpath:spring/applicationContext-*.xml");
	}

	protected void tearDown() throws Exception {

	}
	


}
