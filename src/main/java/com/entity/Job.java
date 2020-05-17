package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Job)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:40:34
 */
@Data
public class Job implements Serializable {
    private static final long serialVersionUID = -80825907229912083L;
    
    private Integer jid;
    
    private String jname;
    
    private String remark;

}