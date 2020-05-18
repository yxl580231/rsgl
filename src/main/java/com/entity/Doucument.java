package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Doucument)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:39:22
 */
@Data
public class Doucument implements Serializable {
    private static final long serialVersionUID = 899188770305861082L;
    
    private Integer did;
    
    private String title;
    
    private String filename;
    
    private String remark;
    
    private Date createdate;
    
    private Integer userId;

}