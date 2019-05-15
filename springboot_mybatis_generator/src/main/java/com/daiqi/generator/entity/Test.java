package com.daiqi.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Author: Created by DaiQi
* Date: Created in 2019/05/14 18:13
* Description：say something about your class
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Test implements Serializable {
    private Integer id;

    private String name;

    private BigDecimal balance;

    private Date createTime;

    private Date updateTime;

    private Byte deleteStatus;

    private static final long serialVersionUID = 1L;
}