package com.aaa.power.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: power_manager
 * @Package: com.aaa.power.entity
 * @Author: ${白帅}
 * @Description: ${description}
 * @Date: 2019/7/22 18:50
 * @Version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private String sex;
    private Integer deptno;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;
}
