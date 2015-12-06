package com.qihua.console.article;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.qihua.common.GenericDAO;

@Repository
public class ArticleDAO extends GenericDAO<Article, Long> {

    private final static Logger LOGGER = Logger.getLogger(ArticleDAO.class);

}
