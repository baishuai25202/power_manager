package com.aaa.power.service.impl;

import com.aaa.power.entity.Emp;
import com.aaa.power.mapper.EmpMapper;
import com.aaa.power.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ProjectName: power_manager
 * @Package: com.aaa.power.service.impl
 * @Author: ${白帅}
 * @Description: ${description}
 * @Date: 2019/7/22 18:46
 * @Version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper mapper;

    @Override
    public Object getEmp(Map map) {
        return mapper.getEmp(map);
    }

    @Override
    public Emp getPowerList(Integer id) {
        return mapper.getPowerList(id);
    }
}
