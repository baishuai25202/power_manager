package com.aaa.power.controller;

import com.aaa.power.entity.Emp;
import com.aaa.power.service.EmpService;
import com.aaa.power.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: power_manager
 * @Package: com.aaa.power.controller
 * @Author: ${白帅}
 * @Description: ${description}
 * @Date: 2019/7/22 18:44
 * @Version: 1.0
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private PowerService powerService;

@RequestMapping("/getEmp")
    public Object getEmp(@RequestParam Map map){
    return empService.getEmp(map);
    }

@RequestMapping("/getEmpById")
    public Object list(Integer id){
    System.out.println("id"+id);
    HashMap<Object, Object> map = new HashMap<>();
    Emp emp = empService.getPowerList(id);
    map.put("emp",emp);
    map.put("powerList",powerService.getPowerList());
    return map;
}

}
