package pl.sda;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class UserTest {

    @Resource
    User user;

    @Test
    public void testRoomBean() {

        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getRoom());
        Assert.assertEquals(2, user.getRoom().getRoomCapacity());

    }

}