package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2020-05-15 17:39:08
 */
@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = -61085494139440139L;
    
    private Integer did;
    
    private String dname;
    
    private String remark;
}