package com.aaa.power.mapper;

import com.aaa.power.entity.Emp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: power_manager
 * @Package: com.aaa.power.mapper
 * @Author: ${白帅}
 * @Description: ${description}
 * @Date: 2019/7/22 18:45
 * @Version: 1.0
 */
@Repository
public interface EmpMapper {
    List<Emp> getEmp(Map map);
    Emp getPowerList(Integer id);
}
