package com.aaa.power.service;

import com.aaa.power.entity.Emp;

import java.util.Map;

/**
 * @ProjectName: power_manager
 * @Package: com.aaa.power.service
 * @Author: ${白帅}
 * @Description: ${description}
 * @Date: 2019/7/22 18:45
 * @Version: 1.0
 */

public interface EmpService {
    Object getEmp(Map map);
    Emp getPowerList(Integer id);
}
