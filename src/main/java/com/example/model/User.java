package com.example.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by zhan005 on 2016-03-18. Time:11:56 desc:
 */
public class User implements Serializable {
    private static final String TAG = "User";

    public User() {

    }

    public static String getTAG() {
        return TAG;
    }

    private String id = "";
    private String user_name = "";
    private String user_pwd = "";
    private String email = "";
    private String nick_name = "";
    private String introduction = "";
    private String address = "";
    private String mobile = "";
    private String create_time = "";
    private String last_update_time = "";
    private String status = "";
    private String openid = "";
    private String register_type = "";
    private String ishelp = "";
    private String zizhi = "";
    private String zizhi_status = "";
    private String is_vip = "";

    @Override
    public String toString() {
        ValueFilter filter = new ValueFilter() {
            @Override
            public Object process(Object obj, String s, Object v) {
                if (v == null)
                    return "";
                return v;
            }
        };
        return JSON.toJSONString(this, filter);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(String last_update_time) {
        this.last_update_time = last_update_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getRegister_type() {
        return register_type;
    }

    public void setRegister_type(String register_type) {
        this.register_type = register_type;
    }

    public String getIshelp() {
        return ishelp;
    }

    public void setIshelp(String ishelp) {
        this.ishelp = ishelp;
    }

    public String getZizhi() {
        return zizhi;
    }

    public void setZizhi(String zizhi) {
        this.zizhi = zizhi;
    }

    public String getZizhi_status() {
        return zizhi_status;
    }

    public void setZizhi_status(String zizhi_status) {
        this.zizhi_status = zizhi_status;
    }

    public String getIs_vip() {
        return is_vip;
    }

    public void setIs_vip(String is_vip) {
        this.is_vip = is_vip;
    }
}