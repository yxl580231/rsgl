package com.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Ruser)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
public class Ruser implements Serializable {
    private static final long serialVersionUID = -71117736191233074L;
    
    private Integer uid;
    
    private String username;
    
    private String loginname;
    
    private String pwd;
    
    private Integer ustatus;
    
    private Date createdate;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Ruser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", loginname='" + loginname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", ustatus=" + ustatus +
                ", createdate=" + createdate +
                '}';
    }
}