package com.qihua.test.console.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qihua.console.security.Role;
import com.qihua.console.user.User;
import com.qihua.console.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring/applicationContext-test.xml", "/spring/applicationContext-test-assembly.xml" })
public class TestUser {

    @Autowired
    private UserService service;

    @Test
    public void testSelect() throws Exception {
        System.out.println("TestUser.testSelect()" + service.find().size());
    }

    // @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setUsername("sam.tian");
        user.setPassword("fd28e770000849b91d5e2b2dc7d363bc");
        user.setEmail("sam.tian@163.com");
        user.setMobile("13761622012");
        user.setRole(new Role(new Long(1)));

        service.save(user);

        User user2 = new User();
        user2.setUsername("kuhn.wang");
        user2.setPassword("9d652de355bdc08425639f22f4e4c96e");
        user2.setEmail("kuhn.wang@163.com");
        user2.setMobile("13761622012");
        user2.setRole(new Role(new Long(1)));

        service.save(user2);
    }

    // @Test
    public void testUpdate() throws Exception {
        User item = service.find("bb4fc6416ca14317adff61981bc9c414");
        item.setUsername("sam.zhang");
        item.setRole(new Role(new Long(0)));

        service.save(item);
    }
}
