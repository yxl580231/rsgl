package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2020-05-14 16:55:08
 */
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = 390149557677224541L;
    
    private Integer eid;
    
    private Integer deptId;
    
    private Integer jobId;
    
    private String ename;
    
    private String cardid;
    
    private String address;
    
    private String phone;
    
    private String email;
    
    private Integer sex;
    
    private String education;
    
    private String createdate;

}