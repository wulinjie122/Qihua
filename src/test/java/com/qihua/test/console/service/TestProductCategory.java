package com.qihua.test.console.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qihua.console.product.Category;
import com.qihua.console.product.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring/applicationContext-test.xml", "/spring/applicationContext-test-assembly.xml" })
public class TestProductCategory {

    @Autowired
    private CategoryService service;

    // @Test
    public void testSelect() throws Exception {
        System.out.println("TestMember.testSelect()" + service.find().size());
    }

    @Test
    public void testInsert() throws Exception {
        Category item = new Category();
        item.setCategoryName("电子产品");

        service.save(item);
    }

    // @Test
    public void testUpdate() throws Exception {
        Category item = service.find(new Long(1));
        item.setCategoryName("服装");
        service.save(item);
    }

}
