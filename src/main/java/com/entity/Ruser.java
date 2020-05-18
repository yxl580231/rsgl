package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Ruser)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:41:20
 */
@Data
public class Ruser implements Serializable {
    private static final long serialVersionUID = -71117736191233074L;
    
    private Integer uid;
    
    private String username;
    
    private String loginname;
    
    private String pwd;
    
    private Integer ustatus;
    
    private Date createdate;

}