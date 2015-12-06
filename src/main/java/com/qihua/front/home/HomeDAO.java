package com.qihua.front.home;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.qihua.common.CustomBeanPropertyRowMapper;
import com.qihua.common.GenericDAO;
import com.qihua.front.product.ProductImg;

@Repository
public class HomeDAO extends GenericDAO<ProductImg, String> {

    private final static Logger LOGGER = Logger.getLogger(HomeDAO.class);

    public List<ProductImg> selectImg(String position) {
        List<Object> params = new ArrayList<Object>();
        List<Integer> types = new ArrayList<Integer>();

        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT tb.product_id,      ");
        sql.append("        tb.name,            ");
        sql.append("        tb.extension,       ");
        sql.append("        tb.size             ");
        sql.append("   FROM t_home_img tb       ");
        sql.append("  WHERE tb.position = ?     ");

        params.add(position);
        types.add(Types.VARCHAR);

        return jdbcTemplate.query(sql.toString(), params.toArray(),
                ArrayUtils.toPrimitive(types.toArray(new Integer[types.size()])),
                new CustomBeanPropertyRowMapper<ProductImg>(ProductImg.class));
    }

}
