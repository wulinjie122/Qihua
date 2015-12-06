package com.qihua.test.console.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qihua.console.product.Product;
import com.qihua.console.product.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring/applicationContext-test.xml", "/spring/applicationContext-test-assembly.xml" })
public class TestProduct {

    @Autowired
    private ProductService service;

    // @Test
    public void testSelect() throws Exception {
        System.out.println("TestProduct.testSelect()" + service.find().size());
    }

    @Test
    public void testInsert() throws Exception {
        Product item = new Product();
        item.setProductName("有线游戏键盘机械手感电脑背光键盘迷你键盘笔记本台式键盘");
        item.setPrice(50.2);
        item.setCategoryId(new Long(2));
        item.setDescription("有线游戏键盘产品描述");
        service.save(item);

        Product item2 = new Product();
        item2.setProductName("糖果色彩格子棉拖鞋");
        item2.setPrice(20);
        item2.setCategoryId(new Long(3));
        item2.setDescription("糖果色彩格子棉拖鞋产品描述");
        service.save(item2);
    }

    // @Test
    public void testUpdate() throws Exception {
        Product item = service.find("1402bd73859747a695d61bdee270a5f7");
        item.setProductName("纯银恩戒");
        item.setDescription("纯银恩戒产品描述");
        service.save(item);
    }

}
