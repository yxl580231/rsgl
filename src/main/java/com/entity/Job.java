package com.entity;

import java.io.Serializable;

/**
 * (Job)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:40:34
 */
public class Job implements Serializable {
    private static final long serialVersionUID = -80825907229912083L;
    
    private Integer jid;
    
    private String jname;
    
    private String remark;


    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}