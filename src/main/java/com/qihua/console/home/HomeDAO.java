package com.qihua.console.home;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.qihua.common.CustomBeanPropertyRowMapper;
import com.qihua.common.GenericDAO;
import com.qihua.console.product.ProductImg;

@Repository
public class HomeDAO extends GenericDAO<ProductImg, String> {

    private final static Logger LOGGER = Logger.getLogger(HomeDAO.class);

    public String insertImage(ProductImg img) {
        StringBuilder sql = new StringBuilder();
        sql.append(" INSERT INTO t_home_img         ");
        sql.append("   (name,                       ");
        sql.append("    size,                       ");
        sql.append("    extension,                  ");
        sql.append("    product_id,                 ");
        sql.append("    position,                   ");
        sql.append("    insert_time,                ");
        sql.append("    update_time)                ");
        sql.append(" VALUES                         ");
        sql.append("   (?,                          ");
        sql.append("    ?,                          ");
        sql.append("    ?,                          ");
        sql.append("    ?,                          ");
        sql.append("    ?,                          ");
        sql.append("    ?,                          ");
        sql.append("    ?)                          ");

        jdbcTemplate.update(sql.toString(),
                new Object[] { img.getName(), img.getSize(), img.getExtension(), img.getProductId(), img.getPostion(),
                        img.getInsertTime(), img.getUpdateTime() }, new int[] { Types.VARCHAR, Types.BIGINT,
            Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP });

        return img.getName();
    }

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

    public void deleteImg(String imgName) {
        List<Object> params = new ArrayList<Object>();
        List<Integer> types = new ArrayList<Integer>();

        StringBuilder sql = new StringBuilder("DELETE FROM t_home_img WHERE name = ? ");

        params.add(imgName);
        types.add(Types.VARCHAR);

        jdbcTemplate.update(sql.toString(), params.toArray(),
                ArrayUtils.toPrimitive(types.toArray(new Integer[types.size()])));
    }

}
