package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Notice)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:41:10
 */
@Data
public class Notice implements Serializable {
    private static final long serialVersionUID = -14203037606361075L;
    
    private Integer nid;
    
    private String title;
    
    private String content;
    
    private String createdate;
    
    private Integer userId;

}