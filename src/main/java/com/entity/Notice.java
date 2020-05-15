package com.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Notice)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:41:10
 */
public class Notice implements Serializable {
    private static final long serialVersionUID = -14203037606361075L;
    
    private Integer nid;
    
    private String title;
    
    private String content;
    
    private Date createdate;
    
    private Integer userId;


    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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