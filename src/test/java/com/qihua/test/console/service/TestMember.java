package com.qihua.test.console.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qihua.console.member.Member;
import com.qihua.console.member.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring/applicationContext-test.xml", "/spring/applicationContext-test-assembly.xml" })
public class TestMember {

    @Autowired
    private MemberService service;

    // @Test
    public void testSelect() throws Exception {
        System.out.println("TestMember.testSelect()" + service.find().size());
    }

    // @Test
    public void testInsert() throws Exception {
        Member item = new Member();
        item.setMemberName("zhen.ni");
        service.save(item);

        Member item2 = new Member();
        item2.setMemberName("gang.wu");
        service.save(item2);
    }

    @Test
    public void testUpdate() throws Exception {
        Member item = service.find("3cb46fb0ae3c41b0ae8f849a3503e481");
        item.setMemberName("sam.zhang");
        service.save(item);
    }

}
