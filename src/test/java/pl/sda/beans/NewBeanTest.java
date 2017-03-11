package pl.sda.beans;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class NewBeanTest {

    @Resource
    NewBean newBean;

    private int oldNumber;

    @After
    public void after() {
        newBean.setNumber(oldNumber);
    }

    @Before
    public void before() {
        oldNumber = newBean.getNumber();
        newBean.setNumber(2);
    }

    @Test
    public void test() {

        Assert.assertNotNull(newBean);
        Assert.assertNotNull(newBean.getFirstBean());
        Assert.assertNotNull(newBean.getSecondBean());
        Assert.assertEquals(2, newBean.getNumber());
    }

}