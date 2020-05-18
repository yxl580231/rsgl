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

    private Dept dept;
    
    private Integer jobId;

    private Job job;
    
    private String ename;
    
    private String cardid;
    
    private String address;
    
    private String phone;
    
    private String email;
    
    private Integer sex;

    private String sexStr;
    
    private String education;
    
    private String createdate;

    public String getSexStr(){
        if(this.sex==null){
            return "";
        }
        if (this.sex==1){
            return "男";
        }else {
            return "女";
        }
    }

}