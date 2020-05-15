package com.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Doucument)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
public class Doucument implements Serializable {
    private static final long serialVersionUID = 899188770305861082L;
    
    private Integer did;
    
    private String title;
    
    private String filename;
    
    private String remark;
    
    private Date createdate;
    
    private Integer userId;


    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}