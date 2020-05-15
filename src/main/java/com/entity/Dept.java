package com.entity;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:39:08
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = -61085494139440139L;
    
    private Integer did;
    
    private String dname;
    
    private String remark;


    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}