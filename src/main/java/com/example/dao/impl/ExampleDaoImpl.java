package com.example.dao.impl;

import com.example.dao.ExampleDao;
import com.example.model.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhan005 on 2016-03-18. Time:11:50 desc:
 */
@Repository
public class ExampleDaoImpl implements ExampleDao {
    private static final String TAG = "ExampleDaoImpl";
    private final Logger LOG = LogManager.getLogger(TAG);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User get(String userId) {
        String sql = "select * from tl_user where id = ?";
        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{userId}, new RowCallbackHandler() {

            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getString("id"));
                user.setUser_name(resultSet.getString("user_name"));
                user.setUser_pwd(resultSet.getString("user_pwd"));
                user.setAddress(resultSet.getString("address"));
                user.setEmail(resultSet.getString("email"));
                user.setNick_name(resultSet.getString("nick_name"));
                user.setIntroduction(resultSet.getString("introduction"));
                user.setIs_vip(resultSet.getString("is_vip"));
                user.setIshelp(resultSet.getString("ishelp"));
                user.setMobile(resultSet.getString("mobile"));
                user.setCreate_time(resultSet.getString("create_time"));
                user.setLast_update_time(resultSet.getString("last_update_time"));
                user.setStatus(resultSet.getString("status"));
                user.setOpenid(resultSet.getString("openid"));
                user.setRegister_type(resultSet.getString("register_type"));
                user.setZizhi(resultSet.getString("zizhi"));
                user.setZizhi_status(resultSet.getString("zizhi_status"));
            }
        });
        return user;
    }

    @Override
    public User login(String mobile, String password) {
        String sql = "select b.*,count(0) num from tl_user b where mobile = ? and user_pwd = \'?\'";
        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{mobile, password}, new RowCallbackHandler() {

            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getString("id"));
                user.setUser_name(resultSet.getString("user_name"));
                user.setUser_pwd(resultSet.getString("user_pwd"));
                user.setAddress(resultSet.getString("address"));
                user.setEmail(resultSet.getString("email"));
                user.setNick_name(resultSet.getString("nick_name"));
                user.setIntroduction(resultSet.getString("introduction"));
                user.setIs_vip(resultSet.getString("is_vip"));
                user.setIshelp(resultSet.getString("ishelp"));
                user.setMobile(resultSet.getString("mobile"));
                user.setCreate_time(resultSet.getString("create_time"));
                user.setLast_update_time(resultSet.getString("last_update_time"));
                user.setStatus(resultSet.getString("status"));
                user.setOpenid(resultSet.getString("openid"));
                user.setRegister_type(resultSet.getString("register_type"));
                user.setZizhi(resultSet.getString("zizhi"));
                user.setZizhi_status(resultSet.getString("zizhi_status"));
            }
        });
        return user;
    }

}