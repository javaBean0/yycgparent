package yycg.base.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yycg.base.domain.Sysuser;

/**
 * Created with IDEA
 * author:bigStone
 * Date:2019/5/1
 **/
public class SysuserServiceTest {

    private ApplicationContext applicationContext;

    private SysuserService sysuserService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-*.xml"
        );
        sysuserService = (SysuserService) applicationContext.getBean("sysuserServiceImpl");


    }

    @Test
    public void findSysuserById() {
        try {

            Sysuser sysuser = sysuserService.findSysuserById("123");
            System.out.println(sysuser);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}