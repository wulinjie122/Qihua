package com.qihua.test.console.service;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qihua.console.card.Card;
import com.qihua.console.card.CardService;
import com.qihua.util.IdUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring/applicationContext-test.xml", "/spring/applicationContext-test-assembly.xml" })
public class TestCard {

    @Autowired
    private CardService service;

    // @Test
    public void testSelect() throws Exception {
        System.out.println("TestCard.testSelect()" + service.find().size());
    }

    // @Test
    public void testInsert() throws Exception {
        Card item = new Card();
        item.setCardNo(IdUtils.uuid2());
        item.setPassword("password");
        item.setScore(200);
        service.save(item);

        Card item2 = new Card();
        item2.setCardNo(IdUtils.uuid2());
        item2.setPassword("password");
        item2.setScore(150);
        service.save(item2);
    }

    // @Test
    public void testUpdate() throws Exception {
        Card item = service.find("");
        item.setCardNo(IdUtils.uuid());
        service.save(item);
    }

    @Test
    public void testGenerate() throws Exception {
        for (int idx = 0; idx < 8000; idx++) {
            System.out.println(IdUtils.uuid2() + "\t" + IdUtils.uuid().substring(0, 10) + "\t"
                    + RandomUtils.nextInt(100, 5000));

        }
    }
}
